package p09.textbook.exercise.ex06;

public class Chatting {
	protected String nickName;
	void startCHat(String chatId) {
		String nickName =null;
		//nickName =chatId;
		//locarVal final 변수만 사용가능한데, nickName 2번 할당해서 오류
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "안녕하세요.";
					String message = "["+nickName+"]"+inputData;
					sendMessage(message);
				}
			}
		};
			chat.start();
		}
			class Chat {
				void start() {}
				void sendMessage(String message) {}
		
	}
}
