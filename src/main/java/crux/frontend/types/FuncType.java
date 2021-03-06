package crux.frontend.types;

public final class FuncType extends Type {
    private TypeList args;
    private Type ret;

    public FuncType(TypeList args, Type returnType) {
        this.args = args;
        this.ret = returnType;
    }

    public Type getRet() {
        return ret;
    }

    public TypeList getArgs() {
        return args;
    }

    @Override
    public String toString() {
        return "func(" + args + "):" + ret;
    }
    public boolean equivalent(Type that) {
        return ret.getClass() == that.getClass();
    }
}
