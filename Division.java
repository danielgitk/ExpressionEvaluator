
public class Division implements Expression{

	private final Expression leftExpression;
	private final Expression rightExpression;

	public Division(Expression leftExpression,Expression rightExpression ){
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}
	@Override
	public int interpret() {
    if (rightExpression.interpret()!= 0){
      		return leftExpression.interpret() / rightExpression.interpret();}
	}
}
