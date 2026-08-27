package o;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BrazeActionParser {
    public final handleCardClicklambda1 IconCompatParcelizer;
    public final AddToCustomAttributeArrayStep RemoteActionCompatParcelizer;
    public final BrazeActionParserExternalSyntheticLambda0 read;
    public final long write;

    public abstract void serializer(File file, executelambda4 executelambda4Var);

    public abstract boolean serializer(String str);

    public BrazeActionParser(AddToCustomAttributeArrayStep addToCustomAttributeArrayStep, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, long j, int i) {
        this.RemoteActionCompatParcelizer = addToCustomAttributeArrayStep;
        this.read = brazeActionParserExternalSyntheticLambda0;
        this.write = j;
        this.IconCompatParcelizer = new handleCardClicklambda1(new openUriWithWebViewActivitylambda0(i));
    }
}
