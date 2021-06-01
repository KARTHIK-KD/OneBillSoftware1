import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


public class AnnotationApi {
	@Retention(RetentionPolicy.RUNTIME)
	public @interface Clubs { 

		Game[] value() default {};
	}

	@Game("Cricket")
	@Game("Food Ball")
	@Game("FreeFire")
	@Game("Carrom")
	public @interface Club {
		String value();

	}

	@Repeatable(value = Clubs.class)
	public @interface Game {
		String value();

	}

	public static void main(String[] args) {

		Game[] g = Club.class.getAnnotationsByType(Game.class);
		Clubs club = Club.class.getAnnotation(Clubs.class);
		for (Game games : club.value()) {
			System.out.println(games.value());
		}
		
	
	}

}