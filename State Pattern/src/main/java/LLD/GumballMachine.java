package LLD;

import LLD.State.*;

public class GumballMachine {
    State state;
    int count=0;
    State hasQuarterState;
    State soldOutState;
    State noQuarterState;
    State soldState;
    State winnerState;
    public GumballMachine(int count) {
        this.count = count;
        this.hasQuarterState = new HasQuarterState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.soldState = new SoldState(this);
        this.soldOutState = new SoldOutState(this);
        this.winnerState = new WinnerState(this);
        if (count > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }
    public State getState() {
        return state;
    }
    public void setState(State state) {
        this.state = state;
    }
    public void insertQuarter() {
        state.insertQuarter();
    }
    public void ejectQuarter() {
        state.ejectQuarter();
    }
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }
    public int getCount() {
        return count;
    }
    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count--;
        }
    }
    public State getHasQuarterState() {
        return hasQuarterState;
    }
    public State getSoldOutState() {
        return soldOutState;
    }
    public State getNoQuarterState() {
        return noQuarterState;
    }
    public State getSoldState() {
        return soldState;
    }
    public State getWinnerState() {
        return winnerState;
    }
    @Override public String toString() {
        return "GumballMachine{" + "state=" + state.getClass().getSimpleName() + ", count=" + count + '}';
    }
}
