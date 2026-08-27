package org.tensorflow.lite;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import o.FwFClientConfig;
import o.FwFClientgetEvaluation1;
import o.FwFClientgetEvaluations1;
import o.FwFClientsyncClientsyncResult11;
import o.FwFClienttrackingServiceDelegate1;
import o.getNotificationEK5gGoQ;

/* JADX INFO: loaded from: classes4.dex */
public final class TensorFlowLite {
    public static final UnsatisfiedLinkError read;
    public static final AtomicBoolean[] serializer;
    public static final Logger RemoteActionCompatParcelizer = Logger.getLogger(TensorFlowLite.class.getName());
    public static volatile boolean write = false;

    private static native void nativeDoNothing();

    static {
        String[][] strArr = {new String[]{"tensorflowlite_jni", "tensorflowlite_jni_stable"}, new String[]{"tensorflowlite_jni_gms_client"}};
        UnsatisfiedLinkError unsatisfiedLinkError = null;
        for (int i = 0; i < 2; i++) {
            for (String str : strArr[i]) {
                try {
                    System.loadLibrary(str);
                    RemoteActionCompatParcelizer.info("Loaded native library: " + str);
                    break;
                } catch (UnsatisfiedLinkError e) {
                    RemoteActionCompatParcelizer.info("Didn't load native library: " + str);
                    if (unsatisfiedLinkError == null) {
                        unsatisfiedLinkError = e;
                    } else {
                        unsatisfiedLinkError.addSuppressed(e);
                    }
                }
            }
        }
        read = unsatisfiedLinkError;
        serializer = new AtomicBoolean[FwFClientgetEvaluations1.values().length];
        for (int i2 = 0; i2 < FwFClientgetEvaluations1.values().length; i2++) {
            serializer[i2] = new AtomicBoolean();
        }
    }

    public static String runtimeVersion() {
        getNotificationEK5gGoQ getnotificationek5ggoq;
        Exception exc;
        String str;
        FwFClientgetEvaluations1 fwFClientgetEvaluations1 = FwFClientgetEvaluations1.FROM_APPLICATION_ONLY;
        FwFClientgetEvaluations1 fwFClientgetEvaluations2 = FwFClientgetEvaluations1.PREFER_SYSTEM_OVER_APPLICATION;
        Logger logger = RemoteActionCompatParcelizer;
        AtomicBoolean[] atomicBooleanArr = serializer;
        if (fwFClientgetEvaluations1 == fwFClientgetEvaluations2 || fwFClientgetEvaluations1 == FwFClientgetEvaluations1.FROM_SYSTEM_ONLY) {
            getnotificationek5ggoq = FwFClienttrackingServiceDelegate1.serializer;
            if (((FwFClientgetEvaluation1) getnotificationek5ggoq.IconCompatParcelizer) == null) {
                exc = (Exception) getnotificationek5ggoq.serializer;
            } else if (!atomicBooleanArr[fwFClientgetEvaluations1.ordinal()].getAndSet(true)) {
                logger.info("TfLiteRuntime." + fwFClientgetEvaluations1.name() + ": Using system TF Lite runtime client from com.google.android.gms");
            }
            return ((InterpreterFactoryImpl) ((FwFClientgetEvaluation1) getnotificationek5ggoq.IconCompatParcelizer)).write();
        }
        exc = null;
        getNotificationEK5gGoQ getnotificationek5ggoq2 = FwFClientsyncClientsyncResult11.write;
        FwFClientgetEvaluation1 fwFClientgetEvaluation1 = (FwFClientgetEvaluation1) getnotificationek5ggoq2.IconCompatParcelizer;
        Exception exc2 = (Exception) getnotificationek5ggoq2.serializer;
        if (fwFClientgetEvaluation1 != null) {
            if (!atomicBooleanArr[fwFClientgetEvaluations1.ordinal()].getAndSet(true)) {
                logger.info("TfLiteRuntime." + fwFClientgetEvaluations1.name() + ": Using application TF Lite runtime client from org.tensorflow.lite");
            }
            getnotificationek5ggoq = getnotificationek5ggoq2;
            return ((InterpreterFactoryImpl) ((FwFClientgetEvaluation1) getnotificationek5ggoq.IconCompatParcelizer)).write();
        }
        if (exc == null) {
            exc = exc2;
        } else if (exc.getSuppressed().length == 0) {
            exc.addSuppressed(exc2);
        }
        int i = FwFClientConfig.IconCompatParcelizer[fwFClientgetEvaluations1.ordinal()];
        if (i != 1) {
            str = i != 2 ? "You should declare a build dependency on org.tensorflow.lite:tensorflow-lite or com.google.android.gms:play-services-tflite-java" : "You should declare a build dependency on com.google.android.gms:play-services-tflite-java, or call .runtimeVersion with a value other than TfLiteRuntime.FROM_SYSTEM_ONLY  (see docs for org.tensorflow.lite.TensorFlowLite#runtimeVersion).";
        } else {
            str = "You should declare a build dependency on org.tensorflow.lite:tensorflow-lite, or call .runtimeVersion with a value other than TfLiteRuntime.FROM_APPLICATION_ONLY (see docs for org.tensorflow.lite.TensorFlowLite#runtimeVersion(TfLiteRuntime)).";
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Couldn't find TensorFlow Lite runtime's InterpreterFactoryImpl class -- make sure your app links in the right TensorFlow Lite runtime. ".concat(str), exc);
        return null;
    }

    public static void read() {
        if (write) {
            return;
        }
        try {
            nativeDoNothing();
            write = true;
        } catch (UnsatisfiedLinkError e) {
            UnsatisfiedLinkError unsatisfiedLinkError = read;
            if (unsatisfiedLinkError == null) {
                unsatisfiedLinkError = e;
            }
            UnsatisfiedLinkError unsatisfiedLinkError2 = new UnsatisfiedLinkError("Failed to load native TensorFlow Lite methods. Check that the correct native libraries are present, and, if using a custom native library, have been properly loaded via System.loadLibrary():\n  " + unsatisfiedLinkError);
            unsatisfiedLinkError2.initCause(e);
            throw unsatisfiedLinkError2;
        }
    }
}
