package proj200211.di.entity;

public class JwBmiModule implements BmiModule {

	private String name;
	private float weight;//몸무게
	private float height;//키
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getWeight() {
		return weight;
	}


	public void setWeight(float weight) {
		this.weight = weight;
	}


	public float getHeight() {
		return height;
	}


	public void setHeight(float height) {
		this.height = height;
	}


	public JwBmiModule() {
		// TODO Auto-generated constructor stub
	}
	
	
	public JwBmiModule(String name, float weight, float height) {
		this.name = name;
		this.weight = weight;
		this.height = height;
	}


	@Override
	public String outputName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	@Override
	public float outputBMI() {
		// TODO Auto-generated method stub
		return weight/(height*height);
	}


}
