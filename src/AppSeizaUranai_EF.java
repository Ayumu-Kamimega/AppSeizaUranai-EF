import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class AppSeizaUranai_EF {
	Random ra;
	static ArrayList<Integer> rankArray;
	Scanner sc;

	public AppSeizaUranai_EF(){
		ra = new Random();
		rankArray = new ArrayList<Integer>();
		sc = new Scanner(System.in);

		for(int i = 0;i < 8;i++){
			int num = ra.nextInt(12) + 1;
			while(rankArray.contains(num)){
				num = ra.nextInt(12) + 1;
			}
			rankArray.add(num);
		}
	}
	public static void main(String[] args){

		System.out.println("�`�`�`�`�`�`�����̐肢�`�`�`�`�`�`");

		aries(rankArray.get(0));
		taurus(rankArray.get(1));
		gemini(rankArray.get(2));
		cancer(rankArray.get(3));
		leo(rankArray.get(4));
		virgo(rankArray.get(5));
		libra(rankArray.get(6));
		scorpio(rankArray.get(7));

		System.out.println("�`�`�`�`�`�`�ǂ������!�`�`�`�`�`�`");


	}
	public static void aries(int rank){
		//���R ��炳��
	}
	public static void taurus(int rank){
		//��� �T�M����
	}
	public static void gemini(int rank){
		//�ԉ� �Ă���
	}
	public static void cancer(int rank){
		//���i
	}
	public static void leo(int rank){
		//��R �Ö킳��
	}
	public static void virgo(int rank){
		//�㏗�� ������
	}
	public static void libra(int rank){
		//�ɐ��E�l����
	}
	public static void scorpio(int rank){
		//�ɓ��C������
	}
}
