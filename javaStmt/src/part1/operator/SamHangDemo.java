package part1.operator;

public class SamHangDemo {
	public static void main(String[] args) {
		
		int x = 1, y = 0, z = 0;
		boolean bool = false; // boolean �� ����������
		z = bool ? x : y;
		System.out.println("���׿����� ��� ��� : " + z);
		// bool �� true �� ��� : x ���� 1 ���
		// bool �� false �� ��� : y ���� 0 ���
		
		/*
		 Q.
		 ������ Ÿ�� flag �� 10 �Դϴ�.
		 ������ Ÿ�� flag2 �� 20 �Դϴ�.
		 �־��� ����
		 () ? "flag �� flag2 ���� Ů�ϴ�." : "flag �� flag2 ���� �۽��ϴ�."
		 �϶�.. �ܼ�â�� ���� ���� ��� �ǵ���
		 �������ּ���. 
		 */
		int flag = 10, flag2 = 20;
		boolean comparision= flag > flag2;
		String result = (comparision) ? "flag �� flag2 ���� Ů�ϴ�." : "flag �� flag2 ���� �۽��ϴ�.";
		System.out.println(result);
		/*
		 ��°�(���ϰ�)�� �������̸� ������� �ش��ϴ� ���� Ÿ���� int �� �ְ�
		 ��°�(���ϰ�)�� ���ͷ��̸� ������� �ش��ϴ� ���� Ÿ���� String �̶�� �ش�.
		 */
	}
}