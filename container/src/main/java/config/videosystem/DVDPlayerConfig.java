package config.videosystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.douzone.container.videosystem.Avengers;
import com.douzone.container.videosystem.DVDPlayer;
import com.douzone.container.videosystem.DigitalVideoDisc;

@Configuration
public class DVDPlayerConfig {

	@Bean
	public Avengers avengers() {
		return new Avengers();
	}

	// 주입하기 1번 : Bean 생성 메소드 직접 호출 : 생성자 주입
	// @Bean
	public DVDPlayer dvdPlayer01() {
		return new DVDPlayer(avengers());
	}

	// 주입하기 2번 : 파라미터로 Bean 전달하기 : 생성자 주입
	// @Bean
	public DVDPlayer dvdPlayer02(DigitalVideoDisc dvd) {
		return new DVDPlayer(dvd);
	}

	// 주입하기 3번 : 파라미터로 Bean 전달하기 : Setter 주입
	@Bean
	public DVDPlayer dvdPlayer03(DigitalVideoDisc dvd) {
		DVDPlayer dvdPlayer = new DVDPlayer(dvd);
		dvdPlayer.setDvd(dvd);
		return dvdPlayer;
	}

	// 주입하기 4번 : 같은 타입이 생성된 경우(@Qualifier어노테이션에 이 클래스의 이름을 넣어줌)
	// 굳이 밑에처럼 이름을 지정하지 않아도 클래스 이름으로 식별 가능
	@Bean(name = "dvdPlayer04")  
	public DVDPlayer dvdPlayer04(DigitalVideoDisc dvd) {
		DVDPlayer dvdPlayer = new DVDPlayer(dvd);
		dvdPlayer.setDvd(dvd);
		return dvdPlayer;
	}
}
