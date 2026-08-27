package io.sentry.android.core;

import android.os.FileObserver;
import bo.app.d$$ExternalSyntheticOutline0;
import java.io.File;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.executelambda4;
import o.isArgOptionalJsonObject;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
public final class _init_lambda2 extends FileObserver {
    public final BrazeActionParserExternalSyntheticLambda0 IconCompatParcelizer;
    public final isArgOptionalJsonObject RemoteActionCompatParcelizer;
    public final long read;
    public final String write;

    public _init_lambda2(String str, isArgOptionalJsonObject isargoptionaljsonobject, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, long j) {
        super(str);
        this.write = str;
        this.RemoteActionCompatParcelizer = isargoptionaljsonobject;
        setNativeShader.read(brazeActionParserExternalSyntheticLambda0, "Logger is required.");
        this.IconCompatParcelizer = brazeActionParserExternalSyntheticLambda0;
        this.read = j;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        if (str == null || i != 8) {
            return;
        }
        r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG;
        String str2 = this.write;
        Object[] objArr = {Integer.valueOf(i), str2, str};
        BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0 = this.IconCompatParcelizer;
        brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", objArr);
        executelambda4 executelambda4VarIconCompatParcelizer = pauseWebviewIfNecessarylambda10.IconCompatParcelizer(new addObserverForBackInvoker(this.read, brazeActionParserExternalSyntheticLambda0));
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m(str2);
        sbM.append(File.separator);
        sbM.append(str);
        String string = sbM.toString();
        isArgOptionalJsonObject isargoptionaljsonobject = this.RemoteActionCompatParcelizer;
        isargoptionaljsonobject.getClass();
        isargoptionaljsonobject.serializer(new File(string), executelambda4VarIconCompatParcelizer);
    }
}
