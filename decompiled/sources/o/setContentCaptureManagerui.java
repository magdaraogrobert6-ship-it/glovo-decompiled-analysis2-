package o;

import android.util.Log;
import bo.app.q3$$ExternalSyntheticLambda1;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.roadrunner.customerchat.legacy.core.manager.CustomerChatProviderImpl;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class setContentCaptureManagerui implements Callable {
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ setContentCaptureManagerui(int i, Object obj) {
        this.read = i;
        this.RemoteActionCompatParcelizer = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Throwable th;
        FileInputStream fileInputStreamOpenFileInput;
        int i = this.read;
        Object obj = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            return ((RemoteConfigComponent) obj).write("firebase");
        }
        boolean z = true;
        if (i == 1) {
            checkChildrenPlaceOrderForUpdates checkchildrenplaceorderforupdates = ((CrashlyticsCore) obj).RemoteActionCompatParcelizer;
            checkchildrenplaceorderforupdates.getClass();
            CrashlyticsWorkers.checkBackgroundThread();
            zzbv zzbvVar = checkchildrenplaceorderforupdates.RatingCompat;
            androidx.work.impl.WorkerWrapper.Builder builder = (androidx.work.impl.WorkerWrapper.Builder) zzbvVar.RemoteActionCompatParcelizer;
            String str = (String) zzbvVar.write;
            builder.getClass();
            if (new File((File) builder.read, str).exists()) {
                Log.isLoggable("FirebaseCrashlytics", 2);
                androidx.work.impl.WorkerWrapper.Builder builder2 = (androidx.work.impl.WorkerWrapper.Builder) zzbvVar.RemoteActionCompatParcelizer;
                builder2.getClass();
                new File((File) builder2.read, str).delete();
            } else if (checkchildrenplaceorderforupdates.serializer() == null || !checkchildrenplaceorderforupdates.PlaybackStateCompatCustomAction.IconCompatParcelizer()) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        FileInputStream fileInputStream = null;
        setPrimaryDirectionalMotionAxisOverrider2epLt8ui setprimarydirectionalmotionaxisoverrider2eplt8uiWrite = null;
        if (i == 2) {
            onSemanticsChange onsemanticschange = (onSemanticsChange) obj;
            synchronized (onsemanticschange) {
                setEnableExtraAssertions setenableextraassertions = (setEnableExtraAssertions) onsemanticschange.write.write();
                long jCurrentTimeMillis = System.currentTimeMillis();
                String str2 = ((requestFocusCurrent) onsemanticschange.read.write()).read();
                synchronized (setenableextraassertions) {
                    String str3 = setenableextraassertions.read(jCurrentTimeMillis);
                    str2.getClass();
                    setenableextraassertions.read.serializer(new q3$$ExternalSyntheticLambda1(setenableextraassertions, str3, str2, new isRoot(str2), 1));
                }
            }
            return null;
        }
        if (i == 3) {
            return ((TouchBoundsExpansionKt) obj).write;
        }
        if (i != 4) {
            CustomerChatProviderImpl customerChatProviderImpl = (CustomerChatProviderImpl) obj;
            ArrayList arrayList = customerChatProviderImpl.serializer.read();
            if (arrayList.size() > 1) {
                customerChatProviderImpl.serializer.read.onNext(arrayList);
            }
            return createFromParcel.INSTANCE;
        }
        AndroidComposeViewExternalSyntheticLambda1 androidComposeViewExternalSyntheticLambda1 = (AndroidComposeViewExternalSyntheticLambda1) obj;
        synchronized (androidComposeViewExternalSyntheticLambda1) {
            try {
                try {
                    fileInputStreamOpenFileInput = androidComposeViewExternalSyntheticLambda1.read.openFileInput(androidComposeViewExternalSyntheticLambda1.IconCompatParcelizer);
                    try {
                        int iAvailable = fileInputStreamOpenFileInput.available();
                        byte[] bArr = new byte[iAvailable];
                        fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                        setprimarydirectionalmotionaxisoverrider2eplt8uiWrite = setPrimaryDirectionalMotionAxisOverrider2epLt8ui.write(new JSONObject(new String(bArr, com.adjust.sdk.Constants.ENCODING)));
                        fileInputStreamOpenFileInput.close();
                    } catch (FileNotFoundException | JSONException unused) {
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStreamOpenFileInput;
                        if (fileInputStream == null) {
                            throw th;
                        }
                        fileInputStream.close();
                        throw th;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            } catch (FileNotFoundException | JSONException unused2) {
                fileInputStreamOpenFileInput = null;
            } catch (Throwable th4) {
                th = th4;
            }
        }
        return setprimarydirectionalmotionaxisoverrider2eplt8uiWrite;
    }
}
