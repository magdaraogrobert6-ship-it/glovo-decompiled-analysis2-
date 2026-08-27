package o;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes4.dex */
public final class getUriActionForCardlambda0 implements BrazeActionParserExternalSyntheticLambda0 {
    public getUriActionForCardlambda0() {
    }

    @Override // o.BrazeActionParserExternalSyntheticLambda0
    public final boolean RemoteActionCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco) {
        return true;
    }

    @Override // o.BrazeActionParserExternalSyntheticLambda0
    public final void serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco, String str, Throwable th) {
        if (th == null) {
            IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, str, new Object[0]);
            return;
        }
        PrintStream printStream = System.out;
        String str2 = String.format(str, th.toString());
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        printStream.println(r8lambdal32xcezw71g2xzeh1nm3nimxco + ": " + str2 + "\n" + stringWriter.toString());
    }

    @Override // o.BrazeActionParserExternalSyntheticLambda0
    public final void IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco, String str, Object... objArr) {
        System.out.println(r8lambdal32xcezw71g2xzeh1nm3nimxco + ": " + String.format(str, objArr));
    }

    @Override // o.BrazeActionParserExternalSyntheticLambda0
    public final void serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco, Throwable th, String str, Object... objArr) {
        PrintStream printStream = System.out;
        String str2 = String.format(str, objArr);
        String string = th.toString();
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        printStream.println(r8lambdal32xcezw71g2xzeh1nm3nimxco + ": " + str2 + " \n " + string + "\n" + stringWriter.toString());
    }

    public getUriActionForCardlambda0(int i) {
    }
}
