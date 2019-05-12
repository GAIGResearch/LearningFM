package forwardmodels.decisiontree.conditions;

import forwardmodels.decisiontree.Node;

public abstract class Condition {
	
	Node node;
	public Condition(Node nextNode) {
		this.node = nextNode;
	}
	
	public abstract boolean test(String value);
	
	public Node getNextNode() {
		return node;
	}
	
	public void setNextNode(Node node) {
		this.node = node;
	}

}
