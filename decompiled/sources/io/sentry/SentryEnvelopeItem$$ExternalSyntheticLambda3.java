package io.sentry;

import android.graphics.Bitmap;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.work.impl.WorkerWrapper;
import androidx.work.impl.WorkerWrapperKt;
import com.adjust.sdk.Constants;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.roadrunner.customerchat.legacy.core.LegacyCustomerChatCommunicatorImpl;
import com.roadrunner.customerchat.legacy.core.usecases.DeliveryChatVisibilityUseCase;
import io.sentry.android.core.ScreenshotEventProcessor;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core._init_lambda1;
import io.sentry.android.core._init_lambda4;
import io.sentry.android.core.internal.util.ParcelableVolumeInfo;
import io.sentry.clientreport.RemoteActionCompatParcelizer;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Objects;
import java.util.concurrent.Callable;
import kotlin.TuplesKt;
import o.AndroidComposeViewCompanion;
import o.AndroidComposeViewExternalSyntheticLambda1;
import o.BaseBrazeActionStep;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.ImageBitmapx__hDU;
import o.ImageBitmapx__hDUdefault;
import o.Interval;
import o.PagereLwUrMk;
import o.accessgetAmbientShadowColor0d7_KjUjd;
import o.component23;
import o.createFromParcel;
import o.getCieXyz;
import o.getColorsui_graphics;
import o.getLocalProvidableScrollCaptureInProgress;
import o.logHtmlClicklambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaqu7RmgdCB4kSCqXaBH9yH_wahpM;
import o.removeNodeAtDepth;
import o.requestFocusBypassUnfocusableComposeView;
import o.requirePrecondition;
import o.rotateXimpl;
import o.scaleimpl;
import o.setAmbientShadowColor8_81llA;
import o.setCameraDistance;
import o.setClip;
import o.setFrom58bKbWc;
import o.setOnReadyForComposition;
import o.setPrimaryDirectionalMotionAxisOverrider2epLt8ui;
import o.setRotationX;
import o.setTranslationX;
import o.translateimpldefault;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class SentryEnvelopeItem$$ExternalSyntheticLambda3 implements Callable {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ SentryEnvelopeItem$$ExternalSyntheticLambda3(Object obj, int i, Object obj2) {
        this.serializer = i;
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        boolean z = false;
        switch (this.serializer) {
            case 0:
                BaseBrazeActionStep baseBrazeActionStep = (BaseBrazeActionStep) this.IconCompatParcelizer;
                logHtmlClicklambda0 loghtmlclicklambda0 = (logHtmlClicklambda0) this.RemoteActionCompatParcelizer;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, SentryEnvelopeItem.serializer));
                    try {
                        baseBrazeActionStep.serializer(bufferedWriter, loghtmlclicklambda0);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        return byteArray;
                    } catch (Throwable th) {
                        try {
                            bufferedWriter.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        byteArrayOutputStream.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            case 1:
                ImageBitmapx__hDU imageBitmapx__hDU = (ImageBitmapx__hDU) this.IconCompatParcelizer;
                WorkerWrapper workerWrapper = (WorkerWrapper) this.RemoteActionCompatParcelizer;
                String str = workerWrapper.MediaSessionCompatToken;
                scaleimpl scaleimplVar = workerWrapper.MediaMetadataCompat;
                setFrom58bKbWc setfrom58bkbwc = workerWrapper.MediaSessionCompatQueueItem;
                if (imageBitmapx__hDU instanceof Interval) {
                    setCameraDistance setcameradistance = ((Interval) imageBitmapx__hDU).read;
                    translateimpldefault translateimpldefaultVar = (translateimpldefault) scaleimplVar;
                    setTranslationX settranslationxSerializer = translateimpldefaultVar.serializer(str);
                    rotateXimpl rotateximpl = (rotateXimpl) workerWrapper.MediaDescriptionCompat.RemoteActionCompatParcelizer();
                    rotateximpl.getClass();
                    TuplesKt.write(rotateximpl.RemoteActionCompatParcelizer, false, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new PagereLwUrMk(str, 6));
                    if (settranslationxSerializer != null) {
                        if (settranslationxSerializer == setTranslationX.RUNNING) {
                            if (setcameradistance instanceof setClip) {
                                String str2 = WorkerWrapperKt.RemoteActionCompatParcelizer;
                                setRotationX.read().getClass();
                                if (setfrom58bkbwc.read()) {
                                    workerWrapper.RemoteActionCompatParcelizer();
                                } else {
                                    translateimpldefaultVar.RemoteActionCompatParcelizer(setTranslationX.SUCCEEDED, str);
                                    accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd = ((setClip) setcameradistance).read;
                                    accessgetambientshadowcolor0d7_kjujd.getClass();
                                    TuplesKt.write(translateimpldefaultVar.IconCompatParcelizer, false, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new Recomposer$$ExternalSyntheticLambda4(accessgetambientshadowcolor0d7_kjujd, 18, str));
                                    workerWrapper.serializer.getClass();
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    getColorsui_graphics getcolorsui_graphics = (getColorsui_graphics) workerWrapper.RemoteActionCompatParcelizer;
                                    for (String str3 : getcolorsui_graphics.read(str)) {
                                        if (translateimpldefaultVar.serializer(str3) == setTranslationX.BLOCKED && ((Boolean) TuplesKt.write(getcolorsui_graphics.RemoteActionCompatParcelizer, true, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new PagereLwUrMk(str3, 3))).booleanValue()) {
                                            String str4 = WorkerWrapperKt.RemoteActionCompatParcelizer;
                                            setRotationX.read().getClass();
                                            translateimpldefaultVar.RemoteActionCompatParcelizer(setTranslationX.ENQUEUED, str3);
                                            translateimpldefaultVar.read(jCurrentTimeMillis, str3);
                                        }
                                    }
                                }
                            } else if (setcameradistance instanceof setAmbientShadowColor8_81llA) {
                                String str5 = WorkerWrapperKt.RemoteActionCompatParcelizer;
                                setRotationX.read().getClass();
                                workerWrapper.serializer(-256);
                                z = true;
                            } else {
                                String str6 = WorkerWrapperKt.RemoteActionCompatParcelizer;
                                setRotationX.read().getClass();
                                if (setfrom58bkbwc.read()) {
                                    workerWrapper.RemoteActionCompatParcelizer();
                                } else {
                                    workerWrapper.RemoteActionCompatParcelizer(setcameradistance);
                                }
                            }
                        } else if (!settranslationxSerializer.isFinished()) {
                            workerWrapper.serializer(-512);
                            z = true;
                        }
                    }
                } else if (imageBitmapx__hDU instanceof ImageBitmapx__hDUdefault) {
                    setCameraDistance setcameradistanceRemoteActionCompatParcelizer = ((ImageBitmapx__hDUdefault) imageBitmapx__hDU).RemoteActionCompatParcelizer();
                    String str7 = WorkerWrapperKt.RemoteActionCompatParcelizer;
                    setRotationX.read().getClass();
                    if (setfrom58bkbwc.read()) {
                        workerWrapper.RemoteActionCompatParcelizer();
                    } else {
                        workerWrapper.RemoteActionCompatParcelizer(setcameradistanceRemoteActionCompatParcelizer);
                    }
                } else {
                    if (!(imageBitmapx__hDU instanceof requirePrecondition)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    int iSerializer = ((requirePrecondition) imageBitmapx__hDU).serializer();
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setfrom58bkbwc.IconCompatParcelizer, Boolean.TRUE}, getCieXyz.write())).booleanValue()) {
                        String str8 = WorkerWrapperKt.RemoteActionCompatParcelizer;
                        setRotationX.read().getClass();
                        workerWrapper.serializer(iSerializer);
                    } else {
                        translateimpldefault translateimpldefaultVar2 = (translateimpldefault) scaleimplVar;
                        setTranslationX settranslationxSerializer2 = translateimpldefaultVar2.serializer(str);
                        if (settranslationxSerializer2 == null || settranslationxSerializer2.isFinished()) {
                            String str9 = WorkerWrapperKt.RemoteActionCompatParcelizer;
                            setRotationX setrotationx = setRotationX.read();
                            Objects.toString(settranslationxSerializer2);
                            setrotationx.getClass();
                        } else {
                            String str10 = WorkerWrapperKt.RemoteActionCompatParcelizer;
                            setRotationX setrotationx2 = setRotationX.read();
                            settranslationxSerializer2.toString();
                            setrotationx2.getClass();
                            translateimpldefaultVar2.RemoteActionCompatParcelizer(setTranslationX.ENQUEUED, str);
                            translateimpldefaultVar2.read(iSerializer, str);
                            translateimpldefaultVar2.write(-1L, str);
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                r8lambdaqu7RmgdCB4kSCqXaBH9yH_wahpM r8lambdaqu7rmgdcb4kscqxabh9yh_wahpm = (r8lambdaqu7RmgdCB4kSCqXaBH9yH_wahpM) this.IconCompatParcelizer;
                component23 component23Var = (component23) this.RemoteActionCompatParcelizer;
                synchronized (r8lambdaqu7rmgdcb4kscqxabh9yh_wahpm) {
                    try {
                        try {
                            FileInputStream fileInputStreamOpenFileInput = r8lambdaqu7rmgdcb4kscqxabh9yh_wahpm.IconCompatParcelizer.openFileInput(r8lambdaqu7rmgdcb4kscqxabh9yh_wahpm.serializer);
                            try {
                                CompositionLocalsKtLocalLayoutDirection1 compositionLocalsKtLocalLayoutDirection1 = (CompositionLocalsKtLocalLayoutDirection1) component23Var;
                                compositionLocalsKtLocalLayoutDirection1.getClass();
                                getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress = CompositionLocalsKtLocalLayoutDirection1.serializer;
                                CodedInputStream codedInputStreamIconCompatParcelizer = CodedInputStream.IconCompatParcelizer(fileInputStreamOpenFileInput);
                                GeneratedMessageLite partialFrom = GeneratedMessageLite.parsePartialFrom(compositionLocalsKtLocalLayoutDirection1.IconCompatParcelizer, codedInputStreamIconCompatParcelizer, getlocalprovidablescrollcaptureinprogress);
                                codedInputStreamIconCompatParcelizer.RemoteActionCompatParcelizer(0);
                                if (partialFrom != null && !partialFrom.isInitialized()) {
                                    throw new InvalidProtocolBufferException(partialFrom.newUninitializedMessageException().getMessage());
                                }
                                if (fileInputStreamOpenFileInput != null) {
                                    fileInputStreamOpenFileInput.close();
                                }
                                return partialFrom;
                            } catch (Throwable th5) {
                                if (fileInputStreamOpenFileInput == null) {
                                    throw th5;
                                }
                                try {
                                    fileInputStreamOpenFileInput.close();
                                    throw th5;
                                } catch (Throwable th6) {
                                    th5.addSuppressed(th6);
                                    throw th5;
                                }
                            }
                        } catch (Throwable th7) {
                            throw th7;
                        }
                    } catch (InvalidProtocolBufferException | FileNotFoundException e) {
                        e.getMessage();
                        DefaultContentCardsUpdateHandlerCompanionCREATOR1.serializer();
                        return null;
                    }
                }
            case 3:
                r8lambdaqu7RmgdCB4kSCqXaBH9yH_wahpM r8lambdaqu7rmgdcb4kscqxabh9yh_wahpm2 = (r8lambdaqu7RmgdCB4kSCqXaBH9yH_wahpM) this.IconCompatParcelizer;
                AbstractMessageLite abstractMessageLite = (AbstractMessageLite) this.RemoteActionCompatParcelizer;
                synchronized (r8lambdaqu7rmgdcb4kscqxabh9yh_wahpm2) {
                    FileOutputStream fileOutputStreamOpenFileOutput = r8lambdaqu7rmgdcb4kscqxabh9yh_wahpm2.IconCompatParcelizer.openFileOutput(r8lambdaqu7rmgdcb4kscqxabh9yh_wahpm2.serializer, 0);
                    try {
                        fileOutputStreamOpenFileOutput.write(abstractMessageLite.toByteArray());
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Throwable th8) {
                        if (fileOutputStreamOpenFileOutput == null) {
                            throw th8;
                        }
                        try {
                            fileOutputStreamOpenFileOutput.close();
                            throw th8;
                        } catch (Throwable th9) {
                            th8.addSuppressed(th9);
                            throw th8;
                        }
                    }
                }
                return abstractMessageLite;
            case 4:
                FirebaseRemoteConfig firebaseRemoteConfig = (FirebaseRemoteConfig) this.IconCompatParcelizer;
                requestFocusBypassUnfocusableComposeView requestfocusbypassunfocusablecomposeview = (requestFocusBypassUnfocusableComposeView) this.RemoteActionCompatParcelizer;
                AndroidComposeViewCompanion androidComposeViewCompanion = firebaseRemoteConfig.MediaSessionCompatQueueItem;
                synchronized (androidComposeViewCompanion.RemoteActionCompatParcelizer) {
                    androidComposeViewCompanion.read.edit().putLong("fetch_timeout_in_seconds", requestfocusbypassunfocusablecomposeview.IconCompatParcelizer).putLong("minimum_fetch_interval_in_seconds", requestfocusbypassunfocusablecomposeview.read).commit();
                    break;
                }
                return null;
            case 5:
                setOnReadyForComposition setonreadyforcomposition = (setOnReadyForComposition) this.IconCompatParcelizer;
                setPrimaryDirectionalMotionAxisOverrider2epLt8ui setprimarydirectionalmotionaxisoverrider2eplt8ui = (setPrimaryDirectionalMotionAxisOverrider2epLt8ui) this.RemoteActionCompatParcelizer;
                AndroidComposeViewExternalSyntheticLambda1 androidComposeViewExternalSyntheticLambda1 = setonreadyforcomposition.read;
                synchronized (androidComposeViewExternalSyntheticLambda1) {
                    FileOutputStream fileOutputStreamOpenFileOutput2 = androidComposeViewExternalSyntheticLambda1.read.openFileOutput(androidComposeViewExternalSyntheticLambda1.IconCompatParcelizer, 0);
                    try {
                        fileOutputStreamOpenFileOutput2.write(setprimarydirectionalmotionaxisoverrider2eplt8ui.IconCompatParcelizer.toString().getBytes(Constants.ENCODING));
                        fileOutputStreamOpenFileOutput2.close();
                    } catch (Throwable th10) {
                        fileOutputStreamOpenFileOutput2.close();
                        throw th10;
                    }
                }
                return null;
            case 6:
                LegacyCustomerChatCommunicatorImpl legacyCustomerChatCommunicatorImpl = (LegacyCustomerChatCommunicatorImpl) this.IconCompatParcelizer;
                Boolean bool = (Boolean) this.RemoteActionCompatParcelizer;
                DeliveryChatVisibilityUseCase deliveryChatVisibilityUseCase = legacyCustomerChatCommunicatorImpl.serializer;
                bool.getClass();
                deliveryChatVisibilityUseCase.invoke(bool);
                return createFromParcel.INSTANCE;
            case 7:
                BaseBrazeActionStep baseBrazeActionStep2 = (BaseBrazeActionStep) this.IconCompatParcelizer;
                SentryBaseEvent sentryBaseEvent = (SentryBaseEvent) this.RemoteActionCompatParcelizer;
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream2, SentryEnvelopeItem.serializer));
                    try {
                        baseBrazeActionStep2.serializer(bufferedWriter2, sentryBaseEvent);
                        byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                        bufferedWriter2.close();
                        byteArrayOutputStream2.close();
                        return byteArray2;
                    } catch (Throwable th11) {
                        try {
                            bufferedWriter2.close();
                            throw th11;
                        } catch (Throwable th12) {
                            th11.addSuppressed(th12);
                            throw th11;
                        }
                    }
                } catch (Throwable th13) {
                    try {
                        byteArrayOutputStream2.close();
                        throw th13;
                    } catch (Throwable th14) {
                        th13.addSuppressed(th14);
                        throw th13;
                    }
                }
            case 8:
                BaseBrazeActionStep baseBrazeActionStep3 = (BaseBrazeActionStep) this.IconCompatParcelizer;
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) this.RemoteActionCompatParcelizer;
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter3 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream3, SentryEnvelopeItem.serializer));
                    try {
                        baseBrazeActionStep3.serializer(bufferedWriter3, remoteActionCompatParcelizer);
                        byte[] byteArray3 = byteArrayOutputStream3.toByteArray();
                        bufferedWriter3.close();
                        byteArrayOutputStream3.close();
                        return byteArray3;
                    } catch (Throwable th15) {
                        try {
                            bufferedWriter3.close();
                            throw th15;
                        } catch (Throwable th16) {
                            th15.addSuppressed(th16);
                            throw th15;
                        }
                    }
                } catch (Throwable th17) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th17;
                    } catch (Throwable th18) {
                        th17.addSuppressed(th18);
                        throw th17;
                    }
                }
            case 9:
                return _init_lambda4.read(((_init_lambda1) this.IconCompatParcelizer).write, (SentryAndroidOptions) this.RemoteActionCompatParcelizer);
            default:
                return ParcelableVolumeInfo.write((Bitmap) this.RemoteActionCompatParcelizer, ((ScreenshotEventProcessor) this.IconCompatParcelizer).serializer.getLogger());
        }
    }
}
