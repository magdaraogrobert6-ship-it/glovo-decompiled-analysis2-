package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageSchema;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class component26 {
    public static final component26 IconCompatParcelizer = new component26();
    public final ConcurrentHashMap write = new ConcurrentHashMap();
    public final DefaultHapticFeedback RemoteActionCompatParcelizer = new DefaultHapticFeedback();

    public final DisposableSaveableStateRegistrylambda0 read(Class cls) {
        Class cls2;
        CompositionLocalsKtLocalWindowInfo1.read(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.write;
        DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0Serializer = (DisposableSaveableStateRegistrylambda0) concurrentHashMap.get(cls);
        if (disposableSaveableStateRegistrylambda0Serializer == null) {
            DefaultHapticFeedback defaultHapticFeedback = this.RemoteActionCompatParcelizer;
            defaultHapticFeedback.getClass();
            Class cls3 = registerProvider.read;
            if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = registerProvider.read) != null && !cls2.isAssignableFrom(cls)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
                return null;
            }
            canBeSaved canbesaved = ((DeviceRenderNode) defaultHapticFeedback.write).read(cls);
            if ((canbesaved.RemoteActionCompatParcelizer & 2) == 2) {
                if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                    disposableSaveableStateRegistrylambda0Serializer = offsetTopAndBottom.serializer(registerProvider.RemoteActionCompatParcelizer, getLocalUriHandler.write, canbesaved.serializer);
                } else {
                    com.google.protobuf.UnknownFieldSchema unknownFieldSchema = registerProvider.IconCompatParcelizer;
                    getLocalSoftwareKeyboardController getlocalsoftwarekeyboardcontroller = getLocalUriHandler.IconCompatParcelizer;
                    if (getlocalsoftwarekeyboardcontroller == null) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                    disposableSaveableStateRegistrylambda0Serializer = offsetTopAndBottom.serializer(unknownFieldSchema, getlocalsoftwarekeyboardcontroller, canbesaved.serializer);
                }
            } else if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                disposableSaveableStateRegistrylambda0Serializer = DerivedSizeCompanion.write[canbesaved.IconCompatParcelizer().ordinal()] != 1 ? MessageSchema.serializer(canbesaved, component20.RemoteActionCompatParcelizer, decodeSpanStyle.read, registerProvider.RemoteActionCompatParcelizer, getLocalUriHandler.write, getInverseMatrix.RemoteActionCompatParcelizer) : MessageSchema.serializer(canbesaved, component20.RemoteActionCompatParcelizer, decodeSpanStyle.read, registerProvider.RemoteActionCompatParcelizer, null, getInverseMatrix.RemoteActionCompatParcelizer);
            } else if (DerivedSizeCompanion.write[canbesaved.IconCompatParcelizer().ordinal()] != 1) {
                setHasOverlappingRendering sethasoverlappingrendering = component20.write;
                decodeFontStyle_LCdwA decodefontstyle_lcdwa = decodeSpanStyle.IconCompatParcelizer;
                com.google.protobuf.UnknownFieldSchema unknownFieldSchema2 = registerProvider.IconCompatParcelizer;
                getLocalSoftwareKeyboardController getlocalsoftwarekeyboardcontroller2 = getLocalUriHandler.IconCompatParcelizer;
                if (getlocalsoftwarekeyboardcontroller2 == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                disposableSaveableStateRegistrylambda0Serializer = MessageSchema.serializer(canbesaved, sethasoverlappingrendering, decodefontstyle_lcdwa, unknownFieldSchema2, getlocalsoftwarekeyboardcontroller2, getInverseMatrix.read);
            } else {
                disposableSaveableStateRegistrylambda0Serializer = MessageSchema.serializer(canbesaved, component20.write, decodeSpanStyle.IconCompatParcelizer, registerProvider.IconCompatParcelizer, null, getInverseMatrix.read);
            }
            DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0 = (DisposableSaveableStateRegistrylambda0) concurrentHashMap.putIfAbsent(cls, disposableSaveableStateRegistrylambda0Serializer);
            if (disposableSaveableStateRegistrylambda0 != null) {
                return disposableSaveableStateRegistrylambda0;
            }
        }
        return disposableSaveableStateRegistrylambda0Serializer;
    }
}
