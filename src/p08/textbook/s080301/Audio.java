package p08.textbook.s080301;

import p08.textbook.s080205.RemoteControl;

public class Audio implements RemoteControl{
	//필드
	private int volume;
	
	//trunOn()추상 메소드의 실체메소드
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다");
	}
	
	//trunOff()추상 메소드의 실체메소드
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다");
	}
	
	//setVolume() 추상메소드의 실체메소드
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MXA_VOLUME) {
			this.volume=RemoteControl.MXA_VOLUME;
		}else if(volume <RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		System.out.println("현재 Audio 볼륨:" +this.volume);
	}
}
