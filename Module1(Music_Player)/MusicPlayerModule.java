import java.sql.*;
import java.util.*;

//Table Creation Structure
class Table_Structure{
	public void display() {
		for(int i=0;i<63;i++)
			System.out.print("-");
	}
}

//Running all Else Statement
class else_stmt{
	public void display()
	{
		System.out.println("\t\tThe Song Is Not Present");
	}
	
}

//Main Method
public class MusicPlayerModule {
	static Connection con;
	static Statement stmt;
	static ResultSet rs;
	static PreparedStatement pstmt;
	public static void main(String[] args) throws Exception {
		else_stmt es=new else_stmt();
		Scanner scan=new Scanner(System.in);
		 boolean b1=true;
		Table_Structure tableobj=new Table_Structure();
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MusicPlayer","root","root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		while(b1) {
			System.out.print("\nPress 1 : Play a Song\nPress 2 : Search a Song\nPress 3 : Show all Songs\nPress 4 : Operate on Songs Database\nSelect your option : ");
			int int_opt=scan.nextInt();
			switch(int_opt) {
				case 1:{//outer switch
					System.out.print("\n\tPress A : Play all songs\n\tPress B : Play Songs Randomly\n\tPress C : Play a Particular Song\n\tSelect your option : ");
					char char_opt=scan.next().charAt(0);
					switch(char_opt) {
						case 'A':{//inner switch
							try {
								String query="select * from MusicFiles";
								stmt=(Statement) con.createStatement();
								rs=stmt.executeQuery(query);
								while(rs.next()) {
									System.out.print("\t\tSong : "+(rs.getString("Song_title"))+" is Playing ");
									System.out.println("Artist : "+(rs.getString("Artist_Name")));
									Thread.sleep(1000);//sleep method
								}
							} catch (SQLException e) {
								e.printStackTrace();
							}
							
						}break;//inner switch A
						
						case 'B':{
							String query="select * from MusicFiles order by RAND()";// Random Function 
							stmt=(Statement) con.createStatement();
							rs=stmt.executeQuery(query);
							while(rs.next()) {
								System.out.print("\t\tSong : "+(rs.getString("Song_title"))+" is Playing---> ");
								System.out.println("Artist : "+(rs.getString("Artist_Name")));
								Thread.sleep(1000);		
							}	
						}break;//inner switch B
						
						case 'C':{
							Scanner s=new Scanner(System.in);
							int flg=0;
							String query="select * from MusicFiles";
							stmt=(Statement) con.createStatement();
							System.out.print("\t\tEnter the song name : ");
							String user_song_name=s.nextLine();
							rs=stmt.executeQuery(query);
							while(rs.next()) {
								String name=rs.getString("Song_Title");
								if(name.equalsIgnoreCase(user_song_name)) {
									flg=1;
									System.out.print("\t\tSong : "+(rs.getString("Song_title"))+" is Playing---> ");
									System.out.println("Artist : "+(rs.getString("Artist_Name")));
									Thread.sleep(1000);	
								}
							}
							if(flg==0)
								es.display();
							
						}break;//inner switch C
							
					}
				}break;//outer switch 1
				
				case 2:{
					Scanner s=new Scanner(System.in);
					int flg=0;
					String query="select * from MusicFiles";
					stmt=(Statement) con.createStatement();
					System.out.print("\t\tEnter the song name : ");
					String user_song_name=s.nextLine();
					rs=stmt.executeQuery(query);
					System.out.println("\nID ->Title -> Artist -> Album -> Location -> Description -> \n" );
					while(rs.next()) {
						String name=rs.getString("Song_Title");
						if(name.equalsIgnoreCase(user_song_name)) {
							flg=1;
							tableobj.display();
							System.out.println("\n"+rs.getInt("Song_ID")+" | "+rs.getString("Song_Title")+" | "+rs.getString("Artist_Name")+" | "+rs.getString("Album_Name")+" | "+rs.getString("Song_Location")+" | "+rs.getString("Description")+" | ");	
						}
					}
					if(flg==0){
						es.display();
					}
					else
					{
						tableobj.display();
					}
					rs=stmt.executeQuery(query);
					System.out.println("\nAre you play with song please Enter ID : ");
					int id=scan.nextInt();
					while(rs.next()) {
						if(id==rs.getInt("Song_ID")) {
							System.out.println("Song "+rs.getString("Song_Title")+" is playing ->>>>");
							Thread.sleep(1000);
						}
							
					}
				}break;//outer switch 2
				
				case 3:{
					String query="select * from MusicFiles";
					stmt=(Statement) con.createStatement();
					rs=stmt.executeQuery(query);
					while(rs.next()) {
						tableobj.display();
						System.out.println("\n"+rs.getInt("Song_ID")+" | "+rs.getString("Song_Title")+" | "+rs.getString("Artist_Name")+" | "+rs.getString("Album_Name")+" | "+rs.getString("Song_Location")+" | "+rs.getString("Description")+" | ");
					}
					tableobj.display();
					
					
				}break;//outer switch 3
				case 4:{
					Scanner s=new Scanner(System.in);
					System.out.print("\n\tPress A : Add Song to Songs Repository \n\tPress B : Edit an existing Song info\n\tPress C : Delete an existing Song info\n\tSelect Your option : ");
					char c=s.next().charAt(0);
					switch(c) {
						case 'A':{
							String ss=s.nextLine();
							System.out.print("\t\tEnter Song Title   : ");
							String songs_t=s.nextLine();
							System.out.print("\t\tEnter Artist Name  : ");
							String artist_t=s.nextLine();
							System.out.print("\t\tEnter Album Song   : ");
							String album_t=s.nextLine();
							System.out.print("\t\tEnter Song Location: ");
							String loc_t=s.nextLine();
							System.out.print("\t\tEnter Description  : ");
							String desc_t=s.nextLine();
							String query="insert into MusicFiles(Song_Title,Artist_Name,Album_Name,Song_Location,Description) values(?,?,?,?,?)";
							pstmt=con.prepareStatement(query);
							pstmt.setNString(1,songs_t);
							pstmt.setNString(2,artist_t);
							pstmt.setNString(3,album_t);
							pstmt.setNString(4,loc_t);
							pstmt.setNString(5,desc_t);
							pstmt.executeUpdate();
							System.out.println("\t\t\tNew Song is Added");
						}break;//inner switch A
						
						case 'B':{
							int songid;
							int flg=0;
							String ss=s.nextLine();
							String query="update MusicFiles set Song_Title=? where Song_ID=? "; 
							System.out.print("\t\tEnter Old Song name : ");
							String old_song=s.nextLine();
							System.out.print("\t\tEnter new Song name :");
							String new_song=s.nextLine();
							pstmt=con.prepareStatement(query);
							String query1="select * from MusicFiles";
							stmt=(Statement) con.createStatement();
							rs=stmt.executeQuery(query1);
							while(rs.next() && flg==0) {
								if(old_song.equalsIgnoreCase(rs.getString("Song_Title"))) {
									flg=1;
									songid=rs.getInt("Song_ID");
									pstmt.setString(1,new_song);
									pstmt.setInt(2,songid);
									pstmt.executeUpdate();
									System.out.println("\t\t\tUpdate Successfully");	
								}
								break;
							}
							if(flg==0)
								es.display();
							
						}break;//inner switch B
						case 'C':{
							int songid;
							int flg=0;
							String query="delete from MusicFiles where Song_ID=?";
							String ss=s.nextLine();
							System.out.print("\t\tEnter the Song Name : ");
							String delete_song_name=s.nextLine();
							pstmt=con.prepareStatement(query);
							String query1="select * from MusicFiles";
							stmt=(Statement) con.createStatement();
							rs=stmt.executeQuery(query1);
							while(rs.next()) {
								if(delete_song_name.equalsIgnoreCase(rs.getString("Song_Title"))) {
									flg=1;
									songid=rs.getInt("Song_ID");
									pstmt.setInt(1,songid);
									pstmt.executeUpdate();
									System.out.println("\t\t\tSong is Deleted");
								}	
							}
							if(flg==0)
								es.display();
							
							
						}break;//inner switch C
					}
				}break;//outer switch 4
			}//main switch close
			System.out.print("\nAre You Continue press 1 else 0 : ");
			int num=scan.nextInt();
			if(num==0) {
				System.out.println("Thank you....!");
				b1=false;
				break;
			}
		}//while close
	}//main method close
}//class close
