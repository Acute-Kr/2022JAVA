
public class Main extends Player {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		main.play("she's mine - ZICO");
		main.pause();
		main.stop();
	}

	@Override
	void play(String songName) {
		// TODO Auto-generated method stub
		System.out.println(songName + "���� ����մϴ�.");
	}

	@Override
	void pause() {
		// TODO Auto-generated method stub
		System.out.println("���� �Ͻ������մϴ�.");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("���� �����մϴ�.");
	}

}
