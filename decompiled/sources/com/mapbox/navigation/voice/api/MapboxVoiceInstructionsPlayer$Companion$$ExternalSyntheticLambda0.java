package com.mapbox.navigation.voice.api;

import android.os.SystemClock;
import android.util.CloseGuard;
import androidx.compose.ui.graphics.Fields;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.mapbox.bindgen.Expected;
import com.sentiance.com.microsoft.thrifty.ThriftException;
import com.sentiance.sdk.SdkException;
import com.sentiance.sdk.UserLinker;
import com.sentiance.sdk.UserLinkerAsync;
import com.sentiance.sdk.UserLinkerCallback;
import com.sentiance.sdk.util.d0$$ExternalSyntheticLambda0;
import com.squareup.moshi.JsonDataException;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
import io.sentry.transport.MediaSessionCompatQueueItem;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import o.BrazeActionUtils;
import o.FocusPropertiesImpl;
import o.PinnableContainer;
import o.createFromParcel;
import o.getNavigationEventDispatcher;
import o.getSetSelection;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaaCm2JcMru73kJeywi54SW2Mni8U;
import org.bouncycastle.asn1.ASN1ParsingException;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0 implements PinnableContainer, Consumer, Function, OnFailureListener, FocusPropertiesImpl, Expected.Transformer, getNavigationEventDispatcher, UserLinker, UserLinkerAsync, MediaSessionCompatQueueItem, r8lambdaaCm2JcMru73kJeywi54SW2Mni8U {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 31;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
        } else {
            int i3 = 47 / 0;
        }
    }

    @Override // io.sentry.transport.MediaSessionCompatQueueItem
    public long IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 91;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i4 = read + 3;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return jUptimeMillis;
    }

    @Override // com.sentiance.sdk.UserLinker
    public boolean link(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 83;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        boolean zLambda$static$0 = UserLinker.lambda$static$0(str);
        int i4 = RemoteActionCompatParcelizer + 111;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return zLambda$static$0;
        }
        throw null;
    }

    @Override // o.getNavigationEventDispatcher
    public void onActivityResult(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 79;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 27;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    @Override // com.sentiance.sdk.UserLinkerAsync
    public void link(String str, UserLinkerCallback userLinkerCallback) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 21;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object obj = null;
        UserLinkerAsync.lambda$static$0(str, userLinkerCallback);
        if (i3 == 0) {
            throw null;
        }
        int i4 = RemoteActionCompatParcelizer + 77;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i) {
        this.$r8$classId = i;
    }

    @Override // io.reactivex.functions.Function
    public Object apply(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 23;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            obj.getClass();
            return (List) obj;
        }
        obj.getClass();
        int i3 = 83 / 0;
        return (List) obj;
    }

    @Override // com.mapbox.bindgen.Expected.Transformer
    public Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = read + 83;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ((getSetSelection) obj).getClass();
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = read + 85;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return createfromparcel;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ void m$1(Object obj, String str) throws FileNotFoundException {
        int i = 2 % 2;
        throw new FileNotFoundException(str + obj);
    }

    @Override // o.r8lambdaaCm2JcMru73kJeywi54SW2Mni8U
    public void write(BrazeActionUtils brazeActionUtils) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 95;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this.$r8$classId != 23) {
            brazeActionUtils.serializer(new d0$$ExternalSyntheticLambda0(21, brazeActionUtils));
            return;
        }
        brazeActionUtils.getClass();
        brazeActionUtils.RemoteActionCompatParcelizer(r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer);
        int i4 = RemoteActionCompatParcelizer + 55;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void m(int i, int i2) {
        int i3 = 2 % 2;
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + i2);
    }

    public static /* bridge */ /* synthetic */ CloseGuard m(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 49;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        CloseGuard closeGuard = (CloseGuard) obj;
        int i5 = i2 + 51;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return closeGuard;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void m(int i, long j) {
        int i2 = 2 % 2;
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + j);
    }

    @Override // o.PinnableContainer
    public void onComplete(Task task) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 1;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            task.getClass();
            task.isSuccessful();
            throw null;
        }
        task.getClass();
        if (!task.isSuccessful()) {
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("App review flow launch failed", new Object[0]);
            return;
        }
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("App review flow launch successful", new Object[0]);
        int i3 = RemoteActionCompatParcelizer + 87;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ void m(int i, Object obj, Object obj2, String str) {
        int i2 = 2 % 2;
        throw new IllegalArgumentException(str + obj + obj2 + i);
    }

    public static /* synthetic */ void m(int i, StringBuilder sb) {
        int i2 = 2 % 2;
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void m(ThriftException.Kind kind, String str) {
        int i = 2 % 2;
        throw new ThriftException(kind, str);
    }

    public static /* synthetic */ void m(Object obj, String str) throws SSLPeerUnverifiedException {
        int i = 2 % 2;
        throw new SSLPeerUnverifiedException(str + obj);
    }

    public static /* synthetic */ void m(String str) {
        int i = 2 % 2;
        throw new SdkException(str);
    }

    public static /* synthetic */ void m(String str, Object obj, Exception exc) {
        int i = 2 % 2;
        throw new ASN1ParsingException(str + obj, exc);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2) {
        int i = 2 % 2;
        throw new JsonDataException(str + obj + ((Object) " at path ") + obj2);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3) throws IOException {
        int i = 2 % 2;
        throw new IOException(str + obj + obj2 + obj3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        r5 = com.roadrunner.helpcenter.presentation.activity.HelpCenterActivity.read(r5, r6);
        r6 = com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.read + 67;
        com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        if ((r6 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r4.$r8$classId != 6) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r4.$r8$classId != 6) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        r5.getClass();
        r0 = r6.IconCompatParcelizer.getInsets(519);
        r0.getClass();
        r5.setPadding(r5.getPaddingLeft(), r0.write, r5.getPaddingRight(), r0.serializer);
     */
    @Override // o.FocusPropertiesImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o.FocusRequesterModifierKt onApplyWindowInsets(android.view.View r5, o.FocusRequesterModifierKt r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer
            int r1 = r1 + 27
            int r2 = r1 % 128
            com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.read = r2
            int r1 = r1 % r0
            r2 = 6
            if (r1 != 0) goto L16
            int r1 = r4.$r8$classId
            int r3 = r2 / 0
            if (r1 == r2) goto L38
            goto L1a
        L16:
            int r1 = r4.$r8$classId
            if (r1 == r2) goto L38
        L1a:
            r5.getClass()
            androidx.core.view.WindowInsetsCompat$Impl r0 = r6.IconCompatParcelizer
            r1 = 519(0x207, float:7.27E-43)
            o.setRight r0 = r0.getInsets(r1)
            r0.getClass()
            int r1 = r0.write
            int r0 = r0.serializer
            int r2 = r5.getPaddingLeft()
            int r3 = r5.getPaddingRight()
            r5.setPadding(r2, r1, r3, r0)
            return r6
        L38:
            o.FocusRequesterModifierKt r5 = com.roadrunner.helpcenter.presentation.activity.HelpCenterActivity.read(r5, r6)
            int r6 = com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.read
            int r6 = r6 + 67
            int r1 = r6 % 128
            com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L48
            return r5
        L48:
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.onApplyWindowInsets(android.view.View, o.FocusRequesterModifierKt):o.FocusRequesterModifierKt");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        r6.getClass();
        timber.log.Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r6, "BarcodeAnalyzer: Error scanning barcode", new java.lang.Object[0]);
        r6 = com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.read + 61;
        com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r5.$r8$classId != 4) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r5.$r8$classId != 4) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r6.getClass();
        timber.log.Timber.RemoteActionCompatParcelizer.read("BarcodeAnalyzer: Error scanning QR code: " + r6, new java.lang.Object[0]);
     */
    @Override // com.google.android.gms.tasks.OnFailureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onFailure(java.lang.Exception r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.read
            int r1 = r1 + 65
            int r2 = r1 % 128
            com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 4
            r3 = 0
            if (r1 == 0) goto L18
            int r1 = r5.$r8$classId
            r4 = 91
            int r4 = r4 / r3
            if (r1 == r2) goto L35
            goto L1c
        L18:
            int r1 = r5.$r8$classId
            if (r1 == r2) goto L35
        L1c:
            r6.getClass()
            timber.log.Timber$Forest r0 = timber.log.Timber.RemoteActionCompatParcelizer
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "BarcodeAnalyzer: Error scanning QR code: "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r0.read(r6, r1)
            return
        L35:
            r6.getClass()
            timber.log.Timber$Forest r1 = timber.log.Timber.RemoteActionCompatParcelizer
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r3 = "BarcodeAnalyzer: Error scanning barcode"
            r1.RemoteActionCompatParcelizer(r6, r3, r2)
            int r6 = com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.read
            int r6 = r6 + 61
            int r1 = r6 % 128
            com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer = r1
            int r6 = r6 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.onFailure(java.lang.Exception):void");
    }
}
