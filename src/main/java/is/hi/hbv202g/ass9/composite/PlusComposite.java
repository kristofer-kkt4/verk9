package is.hi.hbv202g.ass9.composite;
import java.util.ArrayList;
import java.util.List;
//PlusComposite objects storing an arbitrary amount of mathematical expressions
//as children that are added together when getResult is called.
public class PlusComposite {
    private MathExpression[] children = new MathExpression[0];

    public void add(MathExpression mathExpression) {
        MathExpression[] newChildren = new MathExpression[this.children.length + 1];
        for (int i = 0; i < this.children.length; i++) {
            newChildren[i] = this.children[i];
        }
        newChildren[this.children.length] = mathExpression;
        this.children = newChildren;
    }

    public int getResult() {
        int result = 0;
        for (MathExpression child : this.children) {
            result += child.getResult();
        }
        return result;
    }
}

