package fußballmanager;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
	public static Spiel s;
	public static void main(String[] args) {
		s = new Spiel();
		loop();
	}
	
	private static void loop(){
		new Thread(() -> {
			new Timer().schedule(new TimerTask() {

				@Override
				public void run() {
					s.tick();
					loop();
				}
			}, 0);
		}).start();
	}
}
