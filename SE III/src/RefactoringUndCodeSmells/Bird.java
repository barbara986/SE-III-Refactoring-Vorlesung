package RefactoringUndCodeSmells;

public class Bird {


	private static final int EUROPEAN = 0;
	private static final int AFRICAN = 1;
	private static final int NORWEGIAN_BLUE = 2;
	
	private int type;
	private int numberOfCoconuts;
	private boolean isNailed;
	private Object voltage;


	double getSpeed() {
		switch (type) {
		case EUROPEAN:
			return getBaseSpeed();
		case AFRICAN:
			return getBaseSpeed() - getLoadFactor() * numberOfCoconuts;
		case NORWEGIAN_BLUE:
			return (isNailed) ? 0 : getBaseSpeed(voltage);
		}
		throw new RuntimeException("Should be unreachable");
	}

	private double getBaseSpeed(Object voltage2) {
		// TODO Auto-generated method stub
		return 0;
	}

	private int getLoadFactor() {
		// TODO Auto-generated method stub
		return 0;
	}

	private double getBaseSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}
}
