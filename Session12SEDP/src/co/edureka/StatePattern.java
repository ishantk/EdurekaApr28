package co.edureka;

interface State{
	String getState();
}

class InitialState implements State{
	
	public String getState(){
		return "InitialState";
	}
}

class FinalState implements State{
	
	public String getState(){
		return "FinalState";
	}
}

class Context{
	
	State state;
	
	void changeContextState(State state){
		this.state = state;
	}
}

public class StatePattern {

	public static void main(String[] args) {
		
		InitialState iState = new InitialState();
		FinalState fState = new FinalState();
		
		Context cxt = new Context();
		cxt.changeContextState(iState);
		
		System.out.println("Context State is: "+cxt.state.getState());
		
		cxt.changeContextState(fState);
		
		System.out.println("Context State is: "+cxt.state.getState());
		
		
	}

}
