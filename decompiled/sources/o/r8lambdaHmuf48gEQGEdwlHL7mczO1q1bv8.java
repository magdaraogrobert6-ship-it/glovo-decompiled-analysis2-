package o;

import android.app.Application;
import android.content.SharedPreferences;
import com.roadrunner.login.logging.OtpLogger;
import com.sentiance.core.model.events.C$b;
import io.grpc.internal.SharedResourcePool;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import okio.Okio;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8 implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int read;
    public final mergeJsonObjects serializer;

    public /* synthetic */ r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8(mergeJsonObjects mergejsonobjects, int i) {
        this.read = i;
        this.serializer = mergejsonobjects;
    }

    public static r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8 serializer(mergeJsonObjects mergejsonobjects) {
        int i = 2 % 2;
        r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8 r8lambdahmuf48geqgedwlhl7mczo1q1bv8 = new r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8(mergejsonobjects, 1);
        int i2 = IconCompatParcelizer + 103;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return r8lambdahmuf48geqgedwlhl7mczo1q1bv8;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = write + 73;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.read;
        mergeJsonObjects mergejsonobjects = this.serializer;
        switch (i3) {
            case 0:
                return new r8lambdaGjDZxd7jQZoBcNzNhpVRngZ6jXY((r8lambdaJ_QfP3gOiW8g_GLIRW39GJgv5OI) mergejsonobjects.write(), 0);
            case 1:
                return new r8lambdaH04qYyeOzRXd4CFrSTNkPB99_Ds((SharedPreferences) mergejsonobjects.write());
            case 2:
                return new r8lambdaGjDZxd7jQZoBcNzNhpVRngZ6jXY((r8lambdaJ_QfP3gOiW8g_GLIRW39GJgv5OI) mergejsonobjects.write(), 1);
            case 3:
                return new OtpLogger((decode) mergejsonobjects.write(), 16);
            case 4:
                unpackInt2 unpackint2 = new unpackInt2((transferSessionPackageI) mergejsonobjects.write(), 13);
                int i4 = write + 111;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    return unpackint2;
                }
                throw null;
            case 5:
                return new OtpLogger((decode) mergejsonobjects.write(), 17);
            case 6:
                Application application = (Application) mergejsonobjects.write();
                application.getClass();
                C$b c$b = new C$b();
                int iRemoteActionCompatParcelizer = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
                int iRemoteActionCompatParcelizer2 = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
                int iRemoteActionCompatParcelizer3 = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
                provideInsetsValuescytEWk0 provideinsetsvaluescytewk0 = (provideInsetsValuescytEWk0) Okio.IconCompatParcelizer(handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{application}, iRemoteActionCompatParcelizer2, iRemoteActionCompatParcelizer3, 842332784, iRemoteActionCompatParcelizer, -842332783);
                provideinsetsvaluescytewk0.getClass();
                c$b.serializer = provideinsetsvaluescytewk0;
                MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
                c$b.write = mutableStateFlow;
                c$b.IconCompatParcelizer = mutableStateFlow;
                return c$b;
            case 7:
                return new r8lambdad3KDFaViDQCaterPKviUURECBdQ((getIndexForKey) mergejsonobjects.write());
            case 8:
                return new unpackInt2((transferSessionPackageI) mergejsonobjects.write(), 14);
            case 9:
                return new setUdmandroid_sdk_base_release((EnumColumnAdapter) mergejsonobjects.write(), 0);
            case 10:
                return new unpackInt2((transferSessionPackageI) mergejsonobjects.write(), 16);
            default:
                return new getTimeFromEpochInSeconds((getPivotOffsetF1C5BW0) mergejsonobjects.write(), new SharedResourcePool(24), new SharedResourcePool(24));
        }
    }
}
