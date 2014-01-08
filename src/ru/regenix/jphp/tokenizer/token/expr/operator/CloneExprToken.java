package ru.regenix.jphp.tokenizer.token.expr.operator;

import ru.regenix.jphp.common.Association;
import ru.regenix.jphp.tokenizer.TokenMeta;
import ru.regenix.jphp.tokenizer.TokenType;
import ru.regenix.jphp.tokenizer.token.expr.OperatorExprToken;

public class CloneExprToken extends OperatorExprToken {
    public CloneExprToken(TokenMeta meta) {
        super(meta, TokenType.T_CLONE);
    }

    @Override
    public Association getOnlyAssociation() {
        return Association.RIGHT;
    }

    @Override
    public boolean isBinary() {
        return false;
    }

    @Override
    public int getPriority() {
        return 10;
    }

    @Override
    public String getCode() {
        return "clone";
    }

    @Override
    public boolean isSide() {
        return false;
    }

    @Override
    public boolean isEnvironmentNeeded() {
        return true;
    }

    @Override
    public boolean isTraceNeeded() {
        return true;
    }
}
