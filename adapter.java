package Structural_patterns;

public class AdapterWrapperPattern {
	public static void main(String args[]){
		Guitar eGuitar = new ElectricGuitar();
		eGuitar.onGuitar();
		eGuitar.offGuitar();
		Guitar eAGuitar = new ElectricAcousticGuitar();
		eAGuitar.onGuitar();
		eAGuitar.offGuitar();
	}

	public interface Guitar{
		public void onGuitar();
		public void offGuitar();
	}

	public class ElectricGuitar implements Guitar{

		public void onGuitar() {
			System.out.println("Playing Guitar");
		}

		public void offGuitar() {
			System.out.println("I'm tired to play the guitar");
		}
	}

	public class AcousticGuitar{

		public void play(){
			System.out.println("Playing Guitar");
		}
		public void leaveGuitar(){
			System.out.println("I'm tired to play the guitar");
		}
	}

	public class ElectricAcousticGuitar implements Guitar{
		AcousticGuitar acoustic = new AcousticGuitar();

		public void onGuitar() {
			acoustic.play();
		}

		public void offGuitar() {
			acoustic.leaveGuitar();
		}
	}
}
