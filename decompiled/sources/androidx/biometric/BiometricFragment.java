package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda2;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import coil3.ImageLoader$Builder;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.common.zzw;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.location.logic.zp;
import com.logistics.rider.glovo.R;
import io.sentry.android.core.SentryLogcatAdapter;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import o.AndroidColorFilter_androidKt;
import o.AndroidGraphicsContext2;
import o.AppCompatImageView;
import o.AppCompatSpinner;
import o.AppCompatTextHelper1;
import o.AppCompatTextView;
import o.Paint;
import o.access1001;
import o.asFrameworkPaint;
import o.colorResource;
import o.createImageBitmap;
import o.displayInAppMessagelambda1;
import o.div7Ah8Wj8;
import o.drawableStateChanged;
import o.getButtonSelectEK5gGoQ;
import o.getDropDownWidth;
import o.getFilterQualityfv9h1I;
import o.getInternalPopup;
import o.getPrompt;
import o.hasOverlappingRendering;
import o.isInfiniteannotations;
import o.minHeight;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.setDropDownHorizontalOffset;
import o.setDropDownWidth;
import o.setImageDrawable;
import o.setPathEffect;
import o.setPopupBackgroundResource;
import o.setStrokeCapBeK7IIE;
import o.setSupportImageTintMode;
import o.unregisterComponentCallback;

/* JADX INFO: loaded from: classes.dex */
public class BiometricFragment extends Fragment {
    public final Handler read = new Handler(Looper.getMainLooper());
    public getPrompt write;

    public final void IconCompatParcelizer(setDropDownHorizontalOffset setdropdownhorizontaloffset) {
        getPrompt getprompt = this.write;
        if (getprompt.MediaSessionCompatToken) {
            getprompt.MediaSessionCompatToken = false;
            Executor minheight = getprompt.MediaMetadataCompat;
            int i = 2;
            if (minheight == null) {
                minheight = new minHeight(2);
            }
            minheight.execute(new CameraX$$ExternalSyntheticLambda2(this, i, setdropdownhorizontaloffset));
        } else {
            SentryLogcatAdapter.IconCompatParcelizer("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        }
        RemoteActionCompatParcelizer();
    }

    public final void MediaMetadataCompat() {
        boolean z;
        if (this.write.ResultReceiver) {
            return;
        }
        if (getContext() == null) {
            SentryLogcatAdapter.IconCompatParcelizer("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        getPrompt getprompt = this.write;
        getprompt.ResultReceiver = true;
        getprompt.MediaSessionCompatToken = true;
        Context context = getContext();
        boolean z2 = false;
        if (context != null) {
            String str = Build.MANUFACTURER;
            if (Build.VERSION.SDK_INT == 29) {
                if (str != null) {
                    String[] stringArray = context.getResources().getStringArray(R.array.keyguard_biometric_and_credential_exclude_vendors);
                    int length = stringArray.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            z = false;
                            break;
                        } else {
                            if (str.equalsIgnoreCase(stringArray[i])) {
                                z = true;
                                break;
                            }
                            i++;
                        }
                    }
                } else {
                    z = false;
                    break;
                }
                if (!z) {
                    int iWrite = this.write.write();
                    if ((iWrite & 255) == 255 && AuthenticatorUtils.read(iWrite)) {
                        this.write.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = true;
                        write();
                        return;
                    }
                }
            }
        }
        if (serializer()) {
            IconCompatParcelizer(12, access1001.write(requireContext().getApplicationContext(), 12));
            return;
        }
        BiometricPrompt.Builder builderWrite = AppCompatImageView.write(requireContext().getApplicationContext());
        getPrompt getprompt2 = this.write;
        zp zpVar = getprompt2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        String str2 = null;
        CharSequence charSequence = zpVar != null ? (CharSequence) zpVar.serializer : null;
        getprompt2.getClass();
        this.write.getClass();
        if (charSequence != null) {
            AppCompatImageView.read(builderWrite, charSequence);
        }
        getPrompt getprompt3 = this.write;
        String str3 = getprompt3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (str3 != null) {
            str2 = str3;
        } else {
            zp zpVar2 = getprompt3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (zpVar2 != null) {
                str2 = (String) zpVar2.IconCompatParcelizer;
            }
        }
        int i2 = 2;
        if (!TextUtils.isEmpty(str2)) {
            Executor minheight = this.write.MediaMetadataCompat;
            if (minheight == null) {
                minheight = new minHeight(2);
            }
            getPrompt getprompt4 = this.write;
            if (getprompt4.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 == null) {
                getprompt4.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = new getButtonSelectEK5gGoQ(getprompt4);
            }
            AppCompatImageView.read(builderWrite, str2, minheight, getprompt4.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            AppCompatSpinner.RemoteActionCompatParcelizer(builderWrite, this.write.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == null);
        }
        int iWrite2 = this.write.write();
        if (i3 >= 30) {
            drawableStateChanged.read(builderWrite, iWrite2);
        } else if (i3 >= 29) {
            AppCompatSpinner.write(builderWrite, AuthenticatorUtils.read(iWrite2));
        }
        BiometricPrompt biometricPromptWrite = AppCompatImageView.write(builderWrite);
        Context context2 = getContext();
        BiometricPrompt.CryptoObject cryptoObjectWrite = CryptoObjectUtils.write(this.write.MediaSessionCompatQueueItem);
        getPrompt getprompt5 = this.write;
        if (getprompt5.MediaDescriptionCompat == null) {
            getprompt5.MediaDescriptionCompat = new i$d(i2, z2);
        }
        i$d i_d = getprompt5.MediaDescriptionCompat;
        if (((CancellationSignal) i_d.serializer) == null) {
            i_d.serializer = setPopupBackgroundResource.write();
        }
        CancellationSignal cancellationSignal = (CancellationSignal) i_d.serializer;
        getInternalPopup getinternalpopup = new getInternalPopup(0);
        getPrompt getprompt6 = this.write;
        if (getprompt6.RemoteActionCompatParcelizer == null) {
            getprompt6.RemoteActionCompatParcelizer = new colorResource(new setDropDownWidth(getprompt6));
        }
        colorResource colorresource = getprompt6.RemoteActionCompatParcelizer;
        if (((BiometricPrompt.AuthenticationCallback) colorresource.IconCompatParcelizer) == null) {
            colorresource.IconCompatParcelizer = setImageDrawable.IconCompatParcelizer((setDropDownWidth) colorresource.write);
        }
        BiometricPrompt.AuthenticationCallback authenticationCallback = (BiometricPrompt.AuthenticationCallback) colorresource.IconCompatParcelizer;
        try {
            if (cryptoObjectWrite == null) {
                AppCompatImageView.RemoteActionCompatParcelizer(biometricPromptWrite, cancellationSignal, getinternalpopup, authenticationCallback);
            } else {
                AppCompatImageView.write(biometricPromptWrite, cryptoObjectWrite, cancellationSignal, getinternalpopup, authenticationCallback);
            }
        } catch (NullPointerException e) {
            SentryLogcatAdapter.read("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e);
            IconCompatParcelizer(1, context2 != null ? context2.getString(R.string.default_error_msg) : "");
        }
    }

    public final void write(int i, CharSequence charSequence) {
        getPrompt getprompt = this.write;
        if (getprompt.PlaybackStateCompatCustomAction) {
            return;
        }
        if (!getprompt.MediaSessionCompatToken) {
            SentryLogcatAdapter.IconCompatParcelizer("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
            return;
        }
        getprompt.MediaSessionCompatToken = false;
        Executor minheight = getprompt.MediaMetadataCompat;
        if (minheight == null) {
            minheight = new minHeight(2);
        }
        minheight.execute(new BiometricFragment$$ExternalSyntheticLambda7(this, i, charSequence, 0));
    }

    public final void IconCompatParcelizer(int i, CharSequence charSequence) {
        write(i, charSequence);
        RemoteActionCompatParcelizer();
    }

    public final void RemoteActionCompatParcelizer() {
        read();
        getPrompt getprompt = this.write;
        getprompt.ResultReceiver = false;
        if (!getprompt.PlaybackStateCompatCustomAction && isAdded()) {
            div7Ah8Wj8 parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            isInfiniteannotations isinfiniteannotations = new isInfiniteannotations(parentFragmentManager);
            isinfiniteannotations.write(this);
            isinfiniteannotations.read(true, true);
        }
        Context context = getContext();
        if (context != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT == 29 && str != null) {
                for (String str2 : context.getResources().getStringArray(R.array.delay_showing_prompt_models)) {
                    if (str.equals(str2)) {
                        getPrompt getprompt2 = this.write;
                        getprompt2.MediaSessionCompatResultReceiverWrapper = true;
                        this.read.postDelayed(new getDropDownWidth(getprompt2, 0), 600L);
                        return;
                    }
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final int i = 1;
        if (this.write == null) {
            getPrompt getprompt = null;
            asFrameworkPaint activity = getArguments().getBoolean("host_activity", true) ? getActivity() : null;
            if (activity == null) {
                activity = getParentFragment();
            }
            if (activity != null) {
                getFilterQualityfv9h1I viewModelStore = activity.getViewModelStore();
                boolean z = activity instanceof AndroidColorFilter_androidKt;
                createImageBitmap defaultViewModelProviderFactory = z ? ((AndroidColorFilter_androidKt) activity).getDefaultViewModelProviderFactory() : Paint.serializer;
                setStrokeCapBeK7IIE defaultViewModelCreationExtras = z ? ((AndroidColorFilter_androidKt) activity).getDefaultViewModelCreationExtras() : setPathEffect.IconCompatParcelizer;
                viewModelStore.getClass();
                defaultViewModelProviderFactory.getClass();
                defaultViewModelCreationExtras.getClass();
                ImageLoader$Builder imageLoader$Builder = new ImageLoader$Builder(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
                r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(getPrompt.class);
                String strRemoteActionCompatParcelizer = r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.RemoteActionCompatParcelizer();
                if (strRemoteActionCompatParcelizer != null) {
                    getprompt = (getPrompt) imageLoader$Builder.write(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strRemoteActionCompatParcelizer));
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Local and anonymous classes can not be ViewModels");
                }
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("view model not found");
            }
            this.write = getprompt;
        }
        getPrompt getprompt2 = this.write;
        FragmentActivity activity2 = getActivity();
        getprompt2.getClass();
        new WeakReference(activity2);
        getPrompt getprompt3 = this.write;
        if (getprompt3.serializer == null) {
            getprompt3.serializer = new AndroidGraphicsContext2();
        }
        final int i2 = 0;
        getprompt3.serializer.serializer(this, new unregisterComponentCallback(this) { // from class: androidx.biometric.BiometricFragment$$ExternalSyntheticLambda1
            public final /* synthetic */ BiometricFragment IconCompatParcelizer;

            {
                this.IconCompatParcelizer = this;
            }

            /* JADX WARN: Code duplicated, block: B:108:0x0171  */
            @Override // o.unregisterComponentCallback
            public final void RemoteActionCompatParcelizer(Object obj) {
                KeyguardManager keyguardManager;
                int i3 = i2;
                BiometricFragment biometricFragment = this.IconCompatParcelizer;
                String string = null;
                if (i3 == 0) {
                    setDropDownHorizontalOffset setdropdownhorizontaloffset = (setDropDownHorizontalOffset) obj;
                    if (setdropdownhorizontaloffset != null) {
                        biometricFragment.IconCompatParcelizer(setdropdownhorizontaloffset);
                        getPrompt getprompt4 = biometricFragment.write;
                        if (getprompt4.serializer == null) {
                            getprompt4.serializer = new AndroidGraphicsContext2();
                        }
                        getPrompt.IconCompatParcelizer(getprompt4.serializer, null);
                        return;
                    }
                    return;
                }
                int i4 = 3;
                int i5 = 0;
                if (i3 != 1) {
                    if (i3 == 2) {
                        CharSequence charSequence = (CharSequence) obj;
                        if (charSequence != null) {
                            if (biometricFragment.serializer()) {
                                biometricFragment.write(charSequence);
                            }
                            biometricFragment.write.read(null);
                            return;
                        }
                        return;
                    }
                    if (i3 == 3) {
                        if (((Boolean) obj).booleanValue()) {
                            if (biometricFragment.serializer()) {
                                biometricFragment.write(biometricFragment.getString(R.string.fingerprint_not_recognized));
                            }
                            getPrompt getprompt5 = biometricFragment.write;
                            if (getprompt5.MediaSessionCompatToken) {
                                Executor minheight = getprompt5.MediaMetadataCompat;
                                if (minheight == null) {
                                    minheight = new minHeight(2);
                                }
                                minheight.execute(new Preview$$ExternalSyntheticLambda0(i4, biometricFragment));
                            } else {
                                SentryLogcatAdapter.IconCompatParcelizer("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                            }
                            getPrompt getprompt6 = biometricFragment.write;
                            if (getprompt6.PlaybackStateCompat == null) {
                                getprompt6.PlaybackStateCompat = new AndroidGraphicsContext2();
                            }
                            getPrompt.IconCompatParcelizer(getprompt6.PlaybackStateCompat, Boolean.FALSE);
                            return;
                        }
                        return;
                    }
                    if (i3 != 4) {
                        if (((Boolean) obj).booleanValue()) {
                            biometricFragment.serializer(1);
                            biometricFragment.RemoteActionCompatParcelizer();
                            getPrompt getprompt7 = biometricFragment.write;
                            if (getprompt7.r8lambda54BeH8ZsBru0CXI2CCSP2syNys == null) {
                                getprompt7.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new AndroidGraphicsContext2();
                            }
                            getPrompt.IconCompatParcelizer(getprompt7.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, Boolean.FALSE);
                            return;
                        }
                        return;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        if (biometricFragment.IconCompatParcelizer()) {
                            biometricFragment.write();
                        } else {
                            getPrompt getprompt8 = biometricFragment.write;
                            String str = getprompt8.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                            if (str != null) {
                                string = str;
                            } else {
                                zp zpVar = getprompt8.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                                if (zpVar != null) {
                                    string = (String) zpVar.IconCompatParcelizer;
                                }
                            }
                            if (string == null) {
                                string = biometricFragment.getString(R.string.default_error_msg);
                            }
                            biometricFragment.IconCompatParcelizer(13, string);
                            biometricFragment.serializer(2);
                        }
                        biometricFragment.write.write(false);
                        return;
                    }
                    return;
                }
                hasOverlappingRendering hasoverlappingrendering = (hasOverlappingRendering) obj;
                if (hasoverlappingrendering != null) {
                    int i6 = hasoverlappingrendering.read;
                    CharSequence charSequenceWrite = hasoverlappingrendering.IconCompatParcelizer;
                    switch (i6) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            break;
                        case 6:
                        default:
                            i6 = 8;
                            break;
                    }
                    Context context = biometricFragment.getContext();
                    int i7 = Build.VERSION.SDK_INT;
                    if (i7 < 29 && ((i6 == 7 || i6 == 9) && context != null && (keyguardManager = AppCompatTextView.read(context)) != null && AppCompatTextView.read(keyguardManager) && AuthenticatorUtils.read(biometricFragment.write.write()))) {
                        biometricFragment.write();
                    } else if (biometricFragment.serializer()) {
                        if (charSequenceWrite == null) {
                            charSequenceWrite = access1001.write(biometricFragment.getContext(), i6);
                        }
                        getPrompt getprompt9 = biometricFragment.write;
                        if (i6 == 5) {
                            int i8 = getprompt9.write;
                            if (i8 == 0 || i8 == 3) {
                                biometricFragment.write(i6, charSequenceWrite);
                            }
                            biometricFragment.RemoteActionCompatParcelizer();
                        } else {
                            if (getprompt9.ComponentActivity) {
                                biometricFragment.IconCompatParcelizer(i6, charSequenceWrite);
                            } else {
                                biometricFragment.write(charSequenceWrite);
                                Handler handler = biometricFragment.read;
                                BiometricFragment$$ExternalSyntheticLambda7 biometricFragment$$ExternalSyntheticLambda7 = new BiometricFragment$$ExternalSyntheticLambda7(biometricFragment, i6, charSequenceWrite, 1);
                                Context context2 = biometricFragment.getContext();
                                if (context2 != null) {
                                    String str2 = Build.MODEL;
                                    if (i7 == 28 && str2 != null) {
                                        String[] stringArray = context2.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes);
                                        int length = stringArray.length;
                                        int i9 = 0;
                                        while (true) {
                                            if (i9 >= length) {
                                                i5 = 2000;
                                            } else if (!str2.startsWith(stringArray[i9])) {
                                                i9++;
                                            }
                                        }
                                    } else {
                                        i5 = 2000;
                                    }
                                } else {
                                    i5 = 2000;
                                }
                                handler.postDelayed(biometricFragment$$ExternalSyntheticLambda7, i5);
                            }
                            biometricFragment.write.ComponentActivity = true;
                        }
                    } else {
                        if (charSequenceWrite == null) {
                            charSequenceWrite = biometricFragment.getString(R.string.default_error_msg) + " " + i6;
                        }
                        biometricFragment.IconCompatParcelizer(i6, charSequenceWrite);
                    }
                    biometricFragment.write.read(null);
                }
            }
        });
        getPrompt getprompt4 = this.write;
        if (getprompt4.read == null) {
            getprompt4.read = new AndroidGraphicsContext2();
        }
        getprompt4.read.serializer(this, new unregisterComponentCallback(this) { // from class: androidx.biometric.BiometricFragment$$ExternalSyntheticLambda1
            public final /* synthetic */ BiometricFragment IconCompatParcelizer;

            {
                this.IconCompatParcelizer = this;
            }

            /* JADX WARN: Code duplicated, block: B:108:0x0171  */
            @Override // o.unregisterComponentCallback
            public final void RemoteActionCompatParcelizer(Object obj) {
                KeyguardManager keyguardManager;
                int i3 = i;
                BiometricFragment biometricFragment = this.IconCompatParcelizer;
                String string = null;
                if (i3 == 0) {
                    setDropDownHorizontalOffset setdropdownhorizontaloffset = (setDropDownHorizontalOffset) obj;
                    if (setdropdownhorizontaloffset != null) {
                        biometricFragment.IconCompatParcelizer(setdropdownhorizontaloffset);
                        getPrompt getprompt5 = biometricFragment.write;
                        if (getprompt5.serializer == null) {
                            getprompt5.serializer = new AndroidGraphicsContext2();
                        }
                        getPrompt.IconCompatParcelizer(getprompt5.serializer, null);
                        return;
                    }
                    return;
                }
                int i4 = 3;
                int i5 = 0;
                if (i3 != 1) {
                    if (i3 == 2) {
                        CharSequence charSequence = (CharSequence) obj;
                        if (charSequence != null) {
                            if (biometricFragment.serializer()) {
                                biometricFragment.write(charSequence);
                            }
                            biometricFragment.write.read(null);
                            return;
                        }
                        return;
                    }
                    if (i3 == 3) {
                        if (((Boolean) obj).booleanValue()) {
                            if (biometricFragment.serializer()) {
                                biometricFragment.write(biometricFragment.getString(R.string.fingerprint_not_recognized));
                            }
                            getPrompt getprompt6 = biometricFragment.write;
                            if (getprompt6.MediaSessionCompatToken) {
                                Executor minheight = getprompt6.MediaMetadataCompat;
                                if (minheight == null) {
                                    minheight = new minHeight(2);
                                }
                                minheight.execute(new Preview$$ExternalSyntheticLambda0(i4, biometricFragment));
                            } else {
                                SentryLogcatAdapter.IconCompatParcelizer("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                            }
                            getPrompt getprompt7 = biometricFragment.write;
                            if (getprompt7.PlaybackStateCompat == null) {
                                getprompt7.PlaybackStateCompat = new AndroidGraphicsContext2();
                            }
                            getPrompt.IconCompatParcelizer(getprompt7.PlaybackStateCompat, Boolean.FALSE);
                            return;
                        }
                        return;
                    }
                    if (i3 != 4) {
                        if (((Boolean) obj).booleanValue()) {
                            biometricFragment.serializer(1);
                            biometricFragment.RemoteActionCompatParcelizer();
                            getPrompt getprompt8 = biometricFragment.write;
                            if (getprompt8.r8lambda54BeH8ZsBru0CXI2CCSP2syNys == null) {
                                getprompt8.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new AndroidGraphicsContext2();
                            }
                            getPrompt.IconCompatParcelizer(getprompt8.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, Boolean.FALSE);
                            return;
                        }
                        return;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        if (biometricFragment.IconCompatParcelizer()) {
                            biometricFragment.write();
                        } else {
                            getPrompt getprompt9 = biometricFragment.write;
                            String str = getprompt9.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                            if (str != null) {
                                string = str;
                            } else {
                                zp zpVar = getprompt9.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                                if (zpVar != null) {
                                    string = (String) zpVar.IconCompatParcelizer;
                                }
                            }
                            if (string == null) {
                                string = biometricFragment.getString(R.string.default_error_msg);
                            }
                            biometricFragment.IconCompatParcelizer(13, string);
                            biometricFragment.serializer(2);
                        }
                        biometricFragment.write.write(false);
                        return;
                    }
                    return;
                }
                hasOverlappingRendering hasoverlappingrendering = (hasOverlappingRendering) obj;
                if (hasoverlappingrendering != null) {
                    int i6 = hasoverlappingrendering.read;
                    CharSequence charSequenceWrite = hasoverlappingrendering.IconCompatParcelizer;
                    switch (i6) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            break;
                        case 6:
                        default:
                            i6 = 8;
                            break;
                    }
                    Context context = biometricFragment.getContext();
                    int i7 = Build.VERSION.SDK_INT;
                    if (i7 < 29 && ((i6 == 7 || i6 == 9) && context != null && (keyguardManager = AppCompatTextView.read(context)) != null && AppCompatTextView.read(keyguardManager) && AuthenticatorUtils.read(biometricFragment.write.write()))) {
                        biometricFragment.write();
                    } else if (biometricFragment.serializer()) {
                        if (charSequenceWrite == null) {
                            charSequenceWrite = access1001.write(biometricFragment.getContext(), i6);
                        }
                        getPrompt getprompt10 = biometricFragment.write;
                        if (i6 == 5) {
                            int i8 = getprompt10.write;
                            if (i8 == 0 || i8 == 3) {
                                biometricFragment.write(i6, charSequenceWrite);
                            }
                            biometricFragment.RemoteActionCompatParcelizer();
                        } else {
                            if (getprompt10.ComponentActivity) {
                                biometricFragment.IconCompatParcelizer(i6, charSequenceWrite);
                            } else {
                                biometricFragment.write(charSequenceWrite);
                                Handler handler = biometricFragment.read;
                                BiometricFragment$$ExternalSyntheticLambda7 biometricFragment$$ExternalSyntheticLambda7 = new BiometricFragment$$ExternalSyntheticLambda7(biometricFragment, i6, charSequenceWrite, 1);
                                Context context2 = biometricFragment.getContext();
                                if (context2 != null) {
                                    String str2 = Build.MODEL;
                                    if (i7 == 28 && str2 != null) {
                                        String[] stringArray = context2.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes);
                                        int length = stringArray.length;
                                        int i9 = 0;
                                        while (true) {
                                            if (i9 >= length) {
                                                i5 = 2000;
                                            } else if (!str2.startsWith(stringArray[i9])) {
                                                i9++;
                                            }
                                        }
                                    } else {
                                        i5 = 2000;
                                    }
                                } else {
                                    i5 = 2000;
                                }
                                handler.postDelayed(biometricFragment$$ExternalSyntheticLambda7, i5);
                            }
                            biometricFragment.write.ComponentActivity = true;
                        }
                    } else {
                        if (charSequenceWrite == null) {
                            charSequenceWrite = biometricFragment.getString(R.string.default_error_msg) + " " + i6;
                        }
                        biometricFragment.IconCompatParcelizer(i6, charSequenceWrite);
                    }
                    biometricFragment.write.read(null);
                }
            }
        });
        getPrompt getprompt5 = this.write;
        if (getprompt5.IconCompatParcelizer == null) {
            getprompt5.IconCompatParcelizer = new AndroidGraphicsContext2();
        }
        final int i3 = 2;
        getprompt5.IconCompatParcelizer.serializer(this, new unregisterComponentCallback(this) { // from class: androidx.biometric.BiometricFragment$$ExternalSyntheticLambda1
            public final /* synthetic */ BiometricFragment IconCompatParcelizer;

            {
                this.IconCompatParcelizer = this;
            }

            /* JADX WARN: Code duplicated, block: B:108:0x0171  */
            @Override // o.unregisterComponentCallback
            public final void RemoteActionCompatParcelizer(Object obj) {
                KeyguardManager keyguardManager;
                int i4 = i3;
                BiometricFragment biometricFragment = this.IconCompatParcelizer;
                String string = null;
                if (i4 == 0) {
                    setDropDownHorizontalOffset setdropdownhorizontaloffset = (setDropDownHorizontalOffset) obj;
                    if (setdropdownhorizontaloffset != null) {
                        biometricFragment.IconCompatParcelizer(setdropdownhorizontaloffset);
                        getPrompt getprompt6 = biometricFragment.write;
                        if (getprompt6.serializer == null) {
                            getprompt6.serializer = new AndroidGraphicsContext2();
                        }
                        getPrompt.IconCompatParcelizer(getprompt6.serializer, null);
                        return;
                    }
                    return;
                }
                int i5 = 3;
                int i6 = 0;
                if (i4 != 1) {
                    if (i4 == 2) {
                        CharSequence charSequence = (CharSequence) obj;
                        if (charSequence != null) {
                            if (biometricFragment.serializer()) {
                                biometricFragment.write(charSequence);
                            }
                            biometricFragment.write.read(null);
                            return;
                        }
                        return;
                    }
                    if (i4 == 3) {
                        if (((Boolean) obj).booleanValue()) {
                            if (biometricFragment.serializer()) {
                                biometricFragment.write(biometricFragment.getString(R.string.fingerprint_not_recognized));
                            }
                            getPrompt getprompt7 = biometricFragment.write;
                            if (getprompt7.MediaSessionCompatToken) {
                                Executor minheight = getprompt7.MediaMetadataCompat;
                                if (minheight == null) {
                                    minheight = new minHeight(2);
                                }
                                minheight.execute(new Preview$$ExternalSyntheticLambda0(i5, biometricFragment));
                            } else {
                                SentryLogcatAdapter.IconCompatParcelizer("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                            }
                            getPrompt getprompt8 = biometricFragment.write;
                            if (getprompt8.PlaybackStateCompat == null) {
                                getprompt8.PlaybackStateCompat = new AndroidGraphicsContext2();
                            }
                            getPrompt.IconCompatParcelizer(getprompt8.PlaybackStateCompat, Boolean.FALSE);
                            return;
                        }
                        return;
                    }
                    if (i4 != 4) {
                        if (((Boolean) obj).booleanValue()) {
                            biometricFragment.serializer(1);
                            biometricFragment.RemoteActionCompatParcelizer();
                            getPrompt getprompt9 = biometricFragment.write;
                            if (getprompt9.r8lambda54BeH8ZsBru0CXI2CCSP2syNys == null) {
                                getprompt9.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new AndroidGraphicsContext2();
                            }
                            getPrompt.IconCompatParcelizer(getprompt9.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, Boolean.FALSE);
                            return;
                        }
                        return;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        if (biometricFragment.IconCompatParcelizer()) {
                            biometricFragment.write();
                        } else {
                            getPrompt getprompt10 = biometricFragment.write;
                            String str = getprompt10.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                            if (str != null) {
                                string = str;
                            } else {
                                zp zpVar = getprompt10.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                                if (zpVar != null) {
                                    string = (String) zpVar.IconCompatParcelizer;
                                }
                            }
                            if (string == null) {
                                string = biometricFragment.getString(R.string.default_error_msg);
                            }
                            biometricFragment.IconCompatParcelizer(13, string);
                            biometricFragment.serializer(2);
                        }
                        biometricFragment.write.write(false);
                        return;
                    }
                    return;
                }
                hasOverlappingRendering hasoverlappingrendering = (hasOverlappingRendering) obj;
                if (hasoverlappingrendering != null) {
                    int i7 = hasoverlappingrendering.read;
                    CharSequence charSequenceWrite = hasoverlappingrendering.IconCompatParcelizer;
                    switch (i7) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            break;
                        case 6:
                        default:
                            i7 = 8;
                            break;
                    }
                    Context context = biometricFragment.getContext();
                    int i8 = Build.VERSION.SDK_INT;
                    if (i8 < 29 && ((i7 == 7 || i7 == 9) && context != null && (keyguardManager = AppCompatTextView.read(context)) != null && AppCompatTextView.read(keyguardManager) && AuthenticatorUtils.read(biometricFragment.write.write()))) {
                        biometricFragment.write();
                    } else if (biometricFragment.serializer()) {
                        if (charSequenceWrite == null) {
                            charSequenceWrite = access1001.write(biometricFragment.getContext(), i7);
                        }
                        getPrompt getprompt11 = biometricFragment.write;
                        if (i7 == 5) {
                            int i9 = getprompt11.write;
                            if (i9 == 0 || i9 == 3) {
                                biometricFragment.write(i7, charSequenceWrite);
                            }
                            biometricFragment.RemoteActionCompatParcelizer();
                        } else {
                            if (getprompt11.ComponentActivity) {
                                biometricFragment.IconCompatParcelizer(i7, charSequenceWrite);
                            } else {
                                biometricFragment.write(charSequenceWrite);
                                Handler handler = biometricFragment.read;
                                BiometricFragment$$ExternalSyntheticLambda7 biometricFragment$$ExternalSyntheticLambda7 = new BiometricFragment$$ExternalSyntheticLambda7(biometricFragment, i7, charSequenceWrite, 1);
                                Context context2 = biometricFragment.getContext();
                                if (context2 != null) {
                                    String str2 = Build.MODEL;
                                    if (i8 == 28 && str2 != null) {
                                        String[] stringArray = context2.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes);
                                        int length = stringArray.length;
                                        int i10 = 0;
                                        while (true) {
                                            if (i10 >= length) {
                                                i6 = 2000;
                                            } else if (!str2.startsWith(stringArray[i10])) {
                                                i10++;
                                            }
                                        }
                                    } else {
                                        i6 = 2000;
                                    }
                                } else {
                                    i6 = 2000;
                                }
                                handler.postDelayed(biometricFragment$$ExternalSyntheticLambda7, i6);
                            }
                            biometricFragment.write.ComponentActivity = true;
                        }
                    } else {
                        if (charSequenceWrite == null) {
                            charSequenceWrite = biometricFragment.getString(R.string.default_error_msg) + " " + i7;
                        }
                        biometricFragment.IconCompatParcelizer(i7, charSequenceWrite);
                    }
                    biometricFragment.write.read(null);
                }
            }
        });
        getPrompt getprompt6 = this.write;
        if (getprompt6.PlaybackStateCompat == null) {
            getprompt6.PlaybackStateCompat = new AndroidGraphicsContext2();
        }
        final int i4 = 3;
        getprompt6.PlaybackStateCompat.serializer(this, new unregisterComponentCallback(this) { // from class: androidx.biometric.BiometricFragment$$ExternalSyntheticLambda1
            public final /* synthetic */ BiometricFragment IconCompatParcelizer;

            {
                this.IconCompatParcelizer = this;
            }

            /* JADX WARN: Code duplicated, block: B:108:0x0171  */
            @Override // o.unregisterComponentCallback
            public final void RemoteActionCompatParcelizer(Object obj) {
                KeyguardManager keyguardManager;
                int i5 = i4;
                BiometricFragment biometricFragment = this.IconCompatParcelizer;
                String string = null;
                if (i5 == 0) {
                    setDropDownHorizontalOffset setdropdownhorizontaloffset = (setDropDownHorizontalOffset) obj;
                    if (setdropdownhorizontaloffset != null) {
                        biometricFragment.IconCompatParcelizer(setdropdownhorizontaloffset);
                        getPrompt getprompt7 = biometricFragment.write;
                        if (getprompt7.serializer == null) {
                            getprompt7.serializer = new AndroidGraphicsContext2();
                        }
                        getPrompt.IconCompatParcelizer(getprompt7.serializer, null);
                        return;
                    }
                    return;
                }
                int i6 = 3;
                int i7 = 0;
                if (i5 != 1) {
                    if (i5 == 2) {
                        CharSequence charSequence = (CharSequence) obj;
                        if (charSequence != null) {
                            if (biometricFragment.serializer()) {
                                biometricFragment.write(charSequence);
                            }
                            biometricFragment.write.read(null);
                            return;
                        }
                        return;
                    }
                    if (i5 == 3) {
                        if (((Boolean) obj).booleanValue()) {
                            if (biometricFragment.serializer()) {
                                biometricFragment.write(biometricFragment.getString(R.string.fingerprint_not_recognized));
                            }
                            getPrompt getprompt8 = biometricFragment.write;
                            if (getprompt8.MediaSessionCompatToken) {
                                Executor minheight = getprompt8.MediaMetadataCompat;
                                if (minheight == null) {
                                    minheight = new minHeight(2);
                                }
                                minheight.execute(new Preview$$ExternalSyntheticLambda0(i6, biometricFragment));
                            } else {
                                SentryLogcatAdapter.IconCompatParcelizer("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                            }
                            getPrompt getprompt9 = biometricFragment.write;
                            if (getprompt9.PlaybackStateCompat == null) {
                                getprompt9.PlaybackStateCompat = new AndroidGraphicsContext2();
                            }
                            getPrompt.IconCompatParcelizer(getprompt9.PlaybackStateCompat, Boolean.FALSE);
                            return;
                        }
                        return;
                    }
                    if (i5 != 4) {
                        if (((Boolean) obj).booleanValue()) {
                            biometricFragment.serializer(1);
                            biometricFragment.RemoteActionCompatParcelizer();
                            getPrompt getprompt10 = biometricFragment.write;
                            if (getprompt10.r8lambda54BeH8ZsBru0CXI2CCSP2syNys == null) {
                                getprompt10.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new AndroidGraphicsContext2();
                            }
                            getPrompt.IconCompatParcelizer(getprompt10.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, Boolean.FALSE);
                            return;
                        }
                        return;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        if (biometricFragment.IconCompatParcelizer()) {
                            biometricFragment.write();
                        } else {
                            getPrompt getprompt11 = biometricFragment.write;
                            String str = getprompt11.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                            if (str != null) {
                                string = str;
                            } else {
                                zp zpVar = getprompt11.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                                if (zpVar != null) {
                                    string = (String) zpVar.IconCompatParcelizer;
                                }
                            }
                            if (string == null) {
                                string = biometricFragment.getString(R.string.default_error_msg);
                            }
                            biometricFragment.IconCompatParcelizer(13, string);
                            biometricFragment.serializer(2);
                        }
                        biometricFragment.write.write(false);
                        return;
                    }
                    return;
                }
                hasOverlappingRendering hasoverlappingrendering = (hasOverlappingRendering) obj;
                if (hasoverlappingrendering != null) {
                    int i8 = hasoverlappingrendering.read;
                    CharSequence charSequenceWrite = hasoverlappingrendering.IconCompatParcelizer;
                    switch (i8) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            break;
                        case 6:
                        default:
                            i8 = 8;
                            break;
                    }
                    Context context = biometricFragment.getContext();
                    int i9 = Build.VERSION.SDK_INT;
                    if (i9 < 29 && ((i8 == 7 || i8 == 9) && context != null && (keyguardManager = AppCompatTextView.read(context)) != null && AppCompatTextView.read(keyguardManager) && AuthenticatorUtils.read(biometricFragment.write.write()))) {
                        biometricFragment.write();
                    } else if (biometricFragment.serializer()) {
                        if (charSequenceWrite == null) {
                            charSequenceWrite = access1001.write(biometricFragment.getContext(), i8);
                        }
                        getPrompt getprompt12 = biometricFragment.write;
                        if (i8 == 5) {
                            int i10 = getprompt12.write;
                            if (i10 == 0 || i10 == 3) {
                                biometricFragment.write(i8, charSequenceWrite);
                            }
                            biometricFragment.RemoteActionCompatParcelizer();
                        } else {
                            if (getprompt12.ComponentActivity) {
                                biometricFragment.IconCompatParcelizer(i8, charSequenceWrite);
                            } else {
                                biometricFragment.write(charSequenceWrite);
                                Handler handler = biometricFragment.read;
                                BiometricFragment$$ExternalSyntheticLambda7 biometricFragment$$ExternalSyntheticLambda7 = new BiometricFragment$$ExternalSyntheticLambda7(biometricFragment, i8, charSequenceWrite, 1);
                                Context context2 = biometricFragment.getContext();
                                if (context2 != null) {
                                    String str2 = Build.MODEL;
                                    if (i9 == 28 && str2 != null) {
                                        String[] stringArray = context2.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes);
                                        int length = stringArray.length;
                                        int i11 = 0;
                                        while (true) {
                                            if (i11 >= length) {
                                                i7 = 2000;
                                            } else if (!str2.startsWith(stringArray[i11])) {
                                                i11++;
                                            }
                                        }
                                    } else {
                                        i7 = 2000;
                                    }
                                } else {
                                    i7 = 2000;
                                }
                                handler.postDelayed(biometricFragment$$ExternalSyntheticLambda7, i7);
                            }
                            biometricFragment.write.ComponentActivity = true;
                        }
                    } else {
                        if (charSequenceWrite == null) {
                            charSequenceWrite = biometricFragment.getString(R.string.default_error_msg) + " " + i8;
                        }
                        biometricFragment.IconCompatParcelizer(i8, charSequenceWrite);
                    }
                    biometricFragment.write.read(null);
                }
            }
        });
        getPrompt getprompt7 = this.write;
        if (getprompt7.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY == null) {
            getprompt7.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new AndroidGraphicsContext2();
        }
        final int i5 = 4;
        getprompt7.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.serializer(this, new unregisterComponentCallback(this) { // from class: androidx.biometric.BiometricFragment$$ExternalSyntheticLambda1
            public final /* synthetic */ BiometricFragment IconCompatParcelizer;

            {
                this.IconCompatParcelizer = this;
            }

            /* JADX WARN: Code duplicated, block: B:108:0x0171  */
            @Override // o.unregisterComponentCallback
            public final void RemoteActionCompatParcelizer(Object obj) {
                KeyguardManager keyguardManager;
                int i6 = i5;
                BiometricFragment biometricFragment = this.IconCompatParcelizer;
                String string = null;
                if (i6 == 0) {
                    setDropDownHorizontalOffset setdropdownhorizontaloffset = (setDropDownHorizontalOffset) obj;
                    if (setdropdownhorizontaloffset != null) {
                        biometricFragment.IconCompatParcelizer(setdropdownhorizontaloffset);
                        getPrompt getprompt8 = biometricFragment.write;
                        if (getprompt8.serializer == null) {
                            getprompt8.serializer = new AndroidGraphicsContext2();
                        }
                        getPrompt.IconCompatParcelizer(getprompt8.serializer, null);
                        return;
                    }
                    return;
                }
                int i7 = 3;
                int i8 = 0;
                if (i6 != 1) {
                    if (i6 == 2) {
                        CharSequence charSequence = (CharSequence) obj;
                        if (charSequence != null) {
                            if (biometricFragment.serializer()) {
                                biometricFragment.write(charSequence);
                            }
                            biometricFragment.write.read(null);
                            return;
                        }
                        return;
                    }
                    if (i6 == 3) {
                        if (((Boolean) obj).booleanValue()) {
                            if (biometricFragment.serializer()) {
                                biometricFragment.write(biometricFragment.getString(R.string.fingerprint_not_recognized));
                            }
                            getPrompt getprompt9 = biometricFragment.write;
                            if (getprompt9.MediaSessionCompatToken) {
                                Executor minheight = getprompt9.MediaMetadataCompat;
                                if (minheight == null) {
                                    minheight = new minHeight(2);
                                }
                                minheight.execute(new Preview$$ExternalSyntheticLambda0(i7, biometricFragment));
                            } else {
                                SentryLogcatAdapter.IconCompatParcelizer("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                            }
                            getPrompt getprompt10 = biometricFragment.write;
                            if (getprompt10.PlaybackStateCompat == null) {
                                getprompt10.PlaybackStateCompat = new AndroidGraphicsContext2();
                            }
                            getPrompt.IconCompatParcelizer(getprompt10.PlaybackStateCompat, Boolean.FALSE);
                            return;
                        }
                        return;
                    }
                    if (i6 != 4) {
                        if (((Boolean) obj).booleanValue()) {
                            biometricFragment.serializer(1);
                            biometricFragment.RemoteActionCompatParcelizer();
                            getPrompt getprompt11 = biometricFragment.write;
                            if (getprompt11.r8lambda54BeH8ZsBru0CXI2CCSP2syNys == null) {
                                getprompt11.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new AndroidGraphicsContext2();
                            }
                            getPrompt.IconCompatParcelizer(getprompt11.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, Boolean.FALSE);
                            return;
                        }
                        return;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        if (biometricFragment.IconCompatParcelizer()) {
                            biometricFragment.write();
                        } else {
                            getPrompt getprompt12 = biometricFragment.write;
                            String str = getprompt12.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                            if (str != null) {
                                string = str;
                            } else {
                                zp zpVar = getprompt12.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                                if (zpVar != null) {
                                    string = (String) zpVar.IconCompatParcelizer;
                                }
                            }
                            if (string == null) {
                                string = biometricFragment.getString(R.string.default_error_msg);
                            }
                            biometricFragment.IconCompatParcelizer(13, string);
                            biometricFragment.serializer(2);
                        }
                        biometricFragment.write.write(false);
                        return;
                    }
                    return;
                }
                hasOverlappingRendering hasoverlappingrendering = (hasOverlappingRendering) obj;
                if (hasoverlappingrendering != null) {
                    int i9 = hasoverlappingrendering.read;
                    CharSequence charSequenceWrite = hasoverlappingrendering.IconCompatParcelizer;
                    switch (i9) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            break;
                        case 6:
                        default:
                            i9 = 8;
                            break;
                    }
                    Context context = biometricFragment.getContext();
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 < 29 && ((i9 == 7 || i9 == 9) && context != null && (keyguardManager = AppCompatTextView.read(context)) != null && AppCompatTextView.read(keyguardManager) && AuthenticatorUtils.read(biometricFragment.write.write()))) {
                        biometricFragment.write();
                    } else if (biometricFragment.serializer()) {
                        if (charSequenceWrite == null) {
                            charSequenceWrite = access1001.write(biometricFragment.getContext(), i9);
                        }
                        getPrompt getprompt13 = biometricFragment.write;
                        if (i9 == 5) {
                            int i11 = getprompt13.write;
                            if (i11 == 0 || i11 == 3) {
                                biometricFragment.write(i9, charSequenceWrite);
                            }
                            biometricFragment.RemoteActionCompatParcelizer();
                        } else {
                            if (getprompt13.ComponentActivity) {
                                biometricFragment.IconCompatParcelizer(i9, charSequenceWrite);
                            } else {
                                biometricFragment.write(charSequenceWrite);
                                Handler handler = biometricFragment.read;
                                BiometricFragment$$ExternalSyntheticLambda7 biometricFragment$$ExternalSyntheticLambda7 = new BiometricFragment$$ExternalSyntheticLambda7(biometricFragment, i9, charSequenceWrite, 1);
                                Context context2 = biometricFragment.getContext();
                                if (context2 != null) {
                                    String str2 = Build.MODEL;
                                    if (i10 == 28 && str2 != null) {
                                        String[] stringArray = context2.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes);
                                        int length = stringArray.length;
                                        int i12 = 0;
                                        while (true) {
                                            if (i12 >= length) {
                                                i8 = 2000;
                                            } else if (!str2.startsWith(stringArray[i12])) {
                                                i12++;
                                            }
                                        }
                                    } else {
                                        i8 = 2000;
                                    }
                                } else {
                                    i8 = 2000;
                                }
                                handler.postDelayed(biometricFragment$$ExternalSyntheticLambda7, i8);
                            }
                            biometricFragment.write.ComponentActivity = true;
                        }
                    } else {
                        if (charSequenceWrite == null) {
                            charSequenceWrite = biometricFragment.getString(R.string.default_error_msg) + " " + i9;
                        }
                        biometricFragment.IconCompatParcelizer(i9, charSequenceWrite);
                    }
                    biometricFragment.write.read(null);
                }
            }
        });
        getPrompt getprompt8 = this.write;
        if (getprompt8.r8lambda54BeH8ZsBru0CXI2CCSP2syNys == null) {
            getprompt8.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new AndroidGraphicsContext2();
        }
        final int i6 = 5;
        getprompt8.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.serializer(this, new unregisterComponentCallback(this) { // from class: androidx.biometric.BiometricFragment$$ExternalSyntheticLambda1
            public final /* synthetic */ BiometricFragment IconCompatParcelizer;

            {
                this.IconCompatParcelizer = this;
            }

            /* JADX WARN: Code duplicated, block: B:108:0x0171  */
            @Override // o.unregisterComponentCallback
            public final void RemoteActionCompatParcelizer(Object obj) {
                KeyguardManager keyguardManager;
                int i7 = i6;
                BiometricFragment biometricFragment = this.IconCompatParcelizer;
                String string = null;
                if (i7 == 0) {
                    setDropDownHorizontalOffset setdropdownhorizontaloffset = (setDropDownHorizontalOffset) obj;
                    if (setdropdownhorizontaloffset != null) {
                        biometricFragment.IconCompatParcelizer(setdropdownhorizontaloffset);
                        getPrompt getprompt9 = biometricFragment.write;
                        if (getprompt9.serializer == null) {
                            getprompt9.serializer = new AndroidGraphicsContext2();
                        }
                        getPrompt.IconCompatParcelizer(getprompt9.serializer, null);
                        return;
                    }
                    return;
                }
                int i8 = 3;
                int i9 = 0;
                if (i7 != 1) {
                    if (i7 == 2) {
                        CharSequence charSequence = (CharSequence) obj;
                        if (charSequence != null) {
                            if (biometricFragment.serializer()) {
                                biometricFragment.write(charSequence);
                            }
                            biometricFragment.write.read(null);
                            return;
                        }
                        return;
                    }
                    if (i7 == 3) {
                        if (((Boolean) obj).booleanValue()) {
                            if (biometricFragment.serializer()) {
                                biometricFragment.write(biometricFragment.getString(R.string.fingerprint_not_recognized));
                            }
                            getPrompt getprompt10 = biometricFragment.write;
                            if (getprompt10.MediaSessionCompatToken) {
                                Executor minheight = getprompt10.MediaMetadataCompat;
                                if (minheight == null) {
                                    minheight = new minHeight(2);
                                }
                                minheight.execute(new Preview$$ExternalSyntheticLambda0(i8, biometricFragment));
                            } else {
                                SentryLogcatAdapter.IconCompatParcelizer("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                            }
                            getPrompt getprompt11 = biometricFragment.write;
                            if (getprompt11.PlaybackStateCompat == null) {
                                getprompt11.PlaybackStateCompat = new AndroidGraphicsContext2();
                            }
                            getPrompt.IconCompatParcelizer(getprompt11.PlaybackStateCompat, Boolean.FALSE);
                            return;
                        }
                        return;
                    }
                    if (i7 != 4) {
                        if (((Boolean) obj).booleanValue()) {
                            biometricFragment.serializer(1);
                            biometricFragment.RemoteActionCompatParcelizer();
                            getPrompt getprompt12 = biometricFragment.write;
                            if (getprompt12.r8lambda54BeH8ZsBru0CXI2CCSP2syNys == null) {
                                getprompt12.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new AndroidGraphicsContext2();
                            }
                            getPrompt.IconCompatParcelizer(getprompt12.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, Boolean.FALSE);
                            return;
                        }
                        return;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        if (biometricFragment.IconCompatParcelizer()) {
                            biometricFragment.write();
                        } else {
                            getPrompt getprompt13 = biometricFragment.write;
                            String str = getprompt13.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                            if (str != null) {
                                string = str;
                            } else {
                                zp zpVar = getprompt13.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                                if (zpVar != null) {
                                    string = (String) zpVar.IconCompatParcelizer;
                                }
                            }
                            if (string == null) {
                                string = biometricFragment.getString(R.string.default_error_msg);
                            }
                            biometricFragment.IconCompatParcelizer(13, string);
                            biometricFragment.serializer(2);
                        }
                        biometricFragment.write.write(false);
                        return;
                    }
                    return;
                }
                hasOverlappingRendering hasoverlappingrendering = (hasOverlappingRendering) obj;
                if (hasoverlappingrendering != null) {
                    int i10 = hasoverlappingrendering.read;
                    CharSequence charSequenceWrite = hasoverlappingrendering.IconCompatParcelizer;
                    switch (i10) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            break;
                        case 6:
                        default:
                            i10 = 8;
                            break;
                    }
                    Context context = biometricFragment.getContext();
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 < 29 && ((i10 == 7 || i10 == 9) && context != null && (keyguardManager = AppCompatTextView.read(context)) != null && AppCompatTextView.read(keyguardManager) && AuthenticatorUtils.read(biometricFragment.write.write()))) {
                        biometricFragment.write();
                    } else if (biometricFragment.serializer()) {
                        if (charSequenceWrite == null) {
                            charSequenceWrite = access1001.write(biometricFragment.getContext(), i10);
                        }
                        getPrompt getprompt14 = biometricFragment.write;
                        if (i10 == 5) {
                            int i12 = getprompt14.write;
                            if (i12 == 0 || i12 == 3) {
                                biometricFragment.write(i10, charSequenceWrite);
                            }
                            biometricFragment.RemoteActionCompatParcelizer();
                        } else {
                            if (getprompt14.ComponentActivity) {
                                biometricFragment.IconCompatParcelizer(i10, charSequenceWrite);
                            } else {
                                biometricFragment.write(charSequenceWrite);
                                Handler handler = biometricFragment.read;
                                BiometricFragment$$ExternalSyntheticLambda7 biometricFragment$$ExternalSyntheticLambda7 = new BiometricFragment$$ExternalSyntheticLambda7(biometricFragment, i10, charSequenceWrite, 1);
                                Context context2 = biometricFragment.getContext();
                                if (context2 != null) {
                                    String str2 = Build.MODEL;
                                    if (i11 == 28 && str2 != null) {
                                        String[] stringArray = context2.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes);
                                        int length = stringArray.length;
                                        int i13 = 0;
                                        while (true) {
                                            if (i13 >= length) {
                                                i9 = 2000;
                                            } else if (!str2.startsWith(stringArray[i13])) {
                                                i13++;
                                            }
                                        }
                                    } else {
                                        i9 = 2000;
                                    }
                                } else {
                                    i9 = 2000;
                                }
                                handler.postDelayed(biometricFragment$$ExternalSyntheticLambda7, i9);
                            }
                            biometricFragment.write.ComponentActivity = true;
                        }
                    } else {
                        if (charSequenceWrite == null) {
                            charSequenceWrite = biometricFragment.getString(R.string.default_error_msg) + " " + i10;
                        }
                        biometricFragment.IconCompatParcelizer(i10, charSequenceWrite);
                    }
                    biometricFragment.write.read(null);
                }
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (Build.VERSION.SDK_INT == 29 && AuthenticatorUtils.read(this.write.write())) {
            getPrompt getprompt = this.write;
            getprompt.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = true;
            this.read.postDelayed(new getDropDownWidth(getprompt, 2), 250L);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (Build.VERSION.SDK_INT >= 29 || this.write.PlaybackStateCompatCustomAction) {
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity == null || !activity.isChangingConfigurations()) {
            serializer(0);
        }
    }

    public final void read() {
        this.write.ResultReceiver = false;
        if (isAdded()) {
        }
    }

    public final void serializer(int i) {
        if (i == 3 || !this.write.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
            if (serializer()) {
                this.write.write = i;
                if (i == 1) {
                    write(10, access1001.write(getContext(), 10));
                }
            }
            getPrompt getprompt = this.write;
            if (getprompt.MediaDescriptionCompat == null) {
                getprompt.MediaDescriptionCompat = new i$d(2, false);
            }
            i$d i_d = getprompt.MediaDescriptionCompat;
            CancellationSignal cancellationSignal = (CancellationSignal) i_d.serializer;
            if (cancellationSignal != null) {
                try {
                    setPopupBackgroundResource.write(cancellationSignal);
                } catch (NullPointerException e) {
                    SentryLogcatAdapter.read("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e);
                }
                i_d.serializer = null;
            }
            zzw zzwVar = (zzw) i_d.read;
            if (zzwVar != null) {
                try {
                    zzwVar.read();
                } catch (NullPointerException e2) {
                    SentryLogcatAdapter.read("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e2);
                }
                i_d.read = null;
            }
        }
    }

    public final boolean IconCompatParcelizer() {
        return Build.VERSION.SDK_INT <= 28 && AuthenticatorUtils.read(this.write.write());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        int i3 = 1;
        if (i == 1) {
            getPrompt getprompt = this.write;
            getprompt.PlaybackStateCompatCustomAction = false;
            if (i2 != -1) {
                IconCompatParcelizer(10, getString(R.string.generic_error_user_canceled));
                return;
            }
            if (getprompt.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) {
                getprompt.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = false;
                i3 = -1;
            }
            IconCompatParcelizer(new setDropDownHorizontalOffset(null, i3));
        }
    }

    public final void write(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getString(R.string.default_error_msg);
        }
        getPrompt getprompt = this.write;
        if (getprompt.ParcelableVolumeInfo == null) {
            getprompt.ParcelableVolumeInfo = new AndroidGraphicsContext2();
        }
        getPrompt.IconCompatParcelizer(getprompt.ParcelableVolumeInfo, 2);
        getPrompt getprompt2 = this.write;
        if (getprompt2.MediaBrowserCompatMediaItem == null) {
            getprompt2.MediaBrowserCompatMediaItem = new AndroidGraphicsContext2();
        }
        getPrompt.IconCompatParcelizer(getprompt2.MediaBrowserCompatMediaItem, charSequence);
    }

    public final void write() {
        Context context = getContext();
        KeyguardManager keyguardManager = context != null ? AppCompatTextView.read(context) : null;
        if (keyguardManager == null) {
            IconCompatParcelizer(12, getString(R.string.generic_error_no_keyguard));
            return;
        }
        getPrompt getprompt = this.write;
        zp zpVar = getprompt.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        CharSequence charSequence = zpVar != null ? (CharSequence) zpVar.serializer : null;
        getprompt.getClass();
        this.write.getClass();
        Intent intentWrite = setSupportImageTintMode.write(keyguardManager, charSequence, null);
        if (intentWrite == null) {
            IconCompatParcelizer(14, getString(R.string.generic_error_no_device_credential));
            return;
        }
        this.write.PlaybackStateCompatCustomAction = true;
        if (serializer()) {
            read();
        }
        intentWrite.setFlags(134742016);
        startActivityForResult(intentWrite, 1);
    }

    public final boolean serializer() {
        Context context = getContext();
        if (context != null && this.write.MediaSessionCompatQueueItem != null) {
            String str = Build.MANUFACTURER;
            String str2 = Build.MODEL;
            if (Build.VERSION.SDK_INT == 28) {
                if (str != null) {
                    for (String str3 : context.getResources().getStringArray(R.array.crypto_fingerprint_fallback_vendors)) {
                        if (str.equalsIgnoreCase(str3)) {
                            return true;
                        }
                    }
                }
                String str4 = Build.MODEL;
                if (str4 != null) {
                    for (String str5 : context.getResources().getStringArray(R.array.crypto_fingerprint_fallback_prefixes)) {
                        if (str4.startsWith(str5)) {
                            return true;
                        }
                    }
                }
            }
        }
        return Build.VERSION.SDK_INT == 28 && !getArguments().getBoolean("has_fingerprint", AppCompatTextHelper1.read(getContext()));
    }
}
