package com.google.crypto.tink.shaded.protobuf;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.LayoutNodeCompanionDummyViewConfiguration1;
import o.LayoutNode_foldedChildren1;
import o.getCoordinatesAccessedDuringModifierPlacement;
import o.getCoordinatesAccessedDuringPlacement;
import o.getDummyViewConfigurationui;
import o.getLastLookaheadConstraintsDWUhwKw;
import o.getNotPlacedPlaceOrderuiannotations;
import o.nextDrawNode;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.setInteropViewFactoryHolderui;
import o.setOnAttachui;
import o.setOnDetachui;
import o.setOuterToInnerOffsetDirtyui;
import o.setSemanticsInvalidatedui;
import o.withComposeStackTrace;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GeneratedMessageLite extends setInteropViewFactoryHolderui {
    private static Map<Object, GeneratedMessageLite> write = new ConcurrentHashMap();
    public getCoordinatesAccessedDuringModifierPlacement IconCompatParcelizer;
    private int read;

    public static void serializer(GeneratedMessageLite generatedMessageLite) throws InvalidProtocolBufferException {
        if (!RemoteActionCompatParcelizer(generatedMessageLite, true)) {
            throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
        }
    }

    public static Object write(Method method, GeneratedMessageLite generatedMessageLite, Object... objArr) {
        try {
            return method.invoke(generatedMessageLite, objArr);
        } catch (IllegalAccessException e) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public final boolean PlaybackStateCompatCustomAction() {
        return (this.read & Integer.MIN_VALUE) != 0;
    }

    public abstract Object RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1 layoutNodeCompanionDummyViewConfiguration1);

    public static GeneratedMessageLite RemoteActionCompatParcelizer(Class cls) {
        GeneratedMessageLite generatedMessageLite = write.get(cls);
        if (generatedMessageLite == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                generatedMessageLite = write.get(cls);
            } catch (ClassNotFoundException e) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (generatedMessageLite != null) {
            return generatedMessageLite;
        }
        GeneratedMessageLite generatedMessageLiteR_ = ((GeneratedMessageLite) getLastLookaheadConstraintsDWUhwKw.IconCompatParcelizer(cls)).r_();
        if (generatedMessageLiteR_ != null) {
            write.put(cls, generatedMessageLiteR_);
            return generatedMessageLiteR_;
        }
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
        return null;
    }

    public static final boolean RemoteActionCompatParcelizer(GeneratedMessageLite generatedMessageLite, boolean z) {
        byte bByteValue = ((Byte) generatedMessageLite.RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        withComposeStackTrace withcomposestacktrace = withComposeStackTrace.write;
        withcomposestacktrace.getClass();
        boolean zIconCompatParcelizer = withcomposestacktrace.RemoteActionCompatParcelizer(generatedMessageLite.getClass()).IconCompatParcelizer((Object) generatedMessageLite);
        if (z) {
            generatedMessageLite.RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1.SET_MEMOIZED_IS_INITIALIZED);
        }
        return zIconCompatParcelizer;
    }

    public static GeneratedMessageLite write(GeneratedMessageLite generatedMessageLite, setOnAttachui setonattachui, getNotPlacedPlaceOrderuiannotations getnotplacedplaceorderuiannotations) throws InvalidProtocolBufferException {
        setOnDetachui setondetachui = (setOnDetachui) setonattachui;
        CodedInputStream$ArrayDecoder codedInputStream$ArrayDecoderIconCompatParcelizer = setOuterToInnerOffsetDirtyui.IconCompatParcelizer(setondetachui.RatingCompat, setondetachui.write(), setondetachui.IconCompatParcelizer(), true);
        GeneratedMessageLite generatedMessageLite2 = read(generatedMessageLite, codedInputStream$ArrayDecoderIconCompatParcelizer, getnotplacedplaceorderuiannotations);
        codedInputStream$ArrayDecoderIconCompatParcelizer.serializer(0);
        serializer(generatedMessageLite2);
        return generatedMessageLite2;
    }

    public final getDummyViewConfigurationui ComponentActivity() {
        getDummyViewConfigurationui getdummyviewconfigurationui = (getDummyViewConfigurationui) RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1.NEW_BUILDER);
        if (!getdummyviewconfigurationui.RemoteActionCompatParcelizer.equals(this)) {
            getdummyviewconfigurationui.MediaMetadataCompat();
            getDummyViewConfigurationui.write(getdummyviewconfigurationui.read, this);
        }
        return getdummyviewconfigurationui;
    }

    @Override // o.accessnextDrawNode
    /* JADX INFO: renamed from: MediaSessionCompatResultReceiverWrapper, reason: merged with bridge method [inline-methods] */
    public final GeneratedMessageLite r_() {
        return (GeneratedMessageLite) RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1.GET_DEFAULT_INSTANCE);
    }

    public final getDummyViewConfigurationui MediaSessionCompatToken() {
        return (getDummyViewConfigurationui) RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1.NEW_BUILDER);
    }

    public final GeneratedMessageLite ResultReceiver() {
        return (GeneratedMessageLite) RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1.NEW_MUTABLE_INSTANCE);
    }

    @Override // o.setInteropViewFactoryHolderui
    /* JADX INFO: renamed from: r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, reason: merged with bridge method [inline-methods] */
    public final getDummyViewConfigurationui PlaybackStateCompat() {
        return (getDummyViewConfigurationui) RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1.NEW_BUILDER);
    }

    public final void serializer(int i) {
        if (i >= 0) {
            this.read = (i & Integer.MAX_VALUE) | (this.read & Integer.MIN_VALUE);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(c8$$ExternalSyntheticOutline0.m(i, "serialized size must be non-negative, was "));
        }
    }

    @Override // o.setInteropViewFactoryHolderui
    public final void serializer(setSemanticsInvalidatedui setsemanticsinvalidatedui) {
        withComposeStackTrace withcomposestacktrace = withComposeStackTrace.write;
        withcomposestacktrace.getClass();
        getCoordinatesAccessedDuringPlacement getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer = withcomposestacktrace.RemoteActionCompatParcelizer(getClass());
        LayoutNode_foldedChildren1 layoutNode_foldedChildren1 = setsemanticsinvalidatedui.MediaMetadataCompat;
        if (layoutNode_foldedChildren1 == null) {
            layoutNode_foldedChildren1 = new LayoutNode_foldedChildren1(setsemanticsinvalidatedui);
        }
        getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this, layoutNode_foldedChildren1);
    }

    public static void RemoteActionCompatParcelizer(Class cls, GeneratedMessageLite generatedMessageLite) {
        generatedMessageLite.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
        write.put(cls, generatedMessageLite);
    }

    public GeneratedMessageLite() {
        this.serializer = 0;
        this.read = -1;
        this.IconCompatParcelizer = getCoordinatesAccessedDuringModifierPlacement.write;
    }

    public static GeneratedMessageLite read(GeneratedMessageLite generatedMessageLite, setOuterToInnerOffsetDirtyui setoutertoinneroffsetdirtyui, getNotPlacedPlaceOrderuiannotations getnotplacedplaceorderuiannotations) throws InvalidProtocolBufferException {
        GeneratedMessageLite generatedMessageLiteResultReceiver = generatedMessageLite.ResultReceiver();
        try {
            withComposeStackTrace withcomposestacktrace = withComposeStackTrace.write;
            withcomposestacktrace.getClass();
            getCoordinatesAccessedDuringPlacement getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer = withcomposestacktrace.RemoteActionCompatParcelizer(generatedMessageLiteResultReceiver.getClass());
            CodedInputStreamReader codedInputStreamReader = setoutertoinneroffsetdirtyui.RemoteActionCompatParcelizer;
            if (codedInputStreamReader == null) {
                codedInputStreamReader = new CodedInputStreamReader(setoutertoinneroffsetdirtyui);
            }
            getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer.write(generatedMessageLiteResultReceiver, codedInputStreamReader, getnotplacedplaceorderuiannotations);
            getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer.write(generatedMessageLiteResultReceiver);
            return generatedMessageLiteResultReceiver;
        } catch (InvalidProtocolBufferException e) {
            if (e.read) {
                throw new InvalidProtocolBufferException(e.getMessage(), e);
            }
            throw e;
        } catch (UninitializedMessageException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw new InvalidProtocolBufferException(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw e4;
        }
    }

    public final String toString() {
        return nextDrawNode.serializer(this, super.toString());
    }

    public final int hashCode() {
        if (PlaybackStateCompatCustomAction()) {
            withComposeStackTrace withcomposestacktrace = withComposeStackTrace.write;
            withcomposestacktrace.getClass();
            return withcomposestacktrace.RemoteActionCompatParcelizer(getClass()).RemoteActionCompatParcelizer(this);
        }
        if (this.serializer == 0) {
            withComposeStackTrace withcomposestacktrace2 = withComposeStackTrace.write;
            withcomposestacktrace2.getClass();
            this.serializer = withcomposestacktrace2.RemoteActionCompatParcelizer(getClass()).RemoteActionCompatParcelizer(this);
        }
        return this.serializer;
    }

    public final void r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
        this.read &= Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        withComposeStackTrace withcomposestacktrace = withComposeStackTrace.write;
        withcomposestacktrace.getClass();
        return withcomposestacktrace.RemoteActionCompatParcelizer(getClass()).IconCompatParcelizer(this, (GeneratedMessageLite) obj);
    }

    @Override // o.setInteropViewFactoryHolderui
    public final int write(getCoordinatesAccessedDuringPlacement getcoordinatesaccessedduringplacement) {
        int iIconCompatParcelizer;
        int iIconCompatParcelizer2;
        if (PlaybackStateCompatCustomAction()) {
            if (getcoordinatesaccessedduringplacement == null) {
                withComposeStackTrace withcomposestacktrace = withComposeStackTrace.write;
                withcomposestacktrace.getClass();
                iIconCompatParcelizer2 = withcomposestacktrace.RemoteActionCompatParcelizer(getClass()).IconCompatParcelizer(this);
            } else {
                iIconCompatParcelizer2 = getcoordinatesaccessedduringplacement.IconCompatParcelizer(this);
            }
            if (iIconCompatParcelizer2 >= 0) {
                return iIconCompatParcelizer2;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write(c8$$ExternalSyntheticOutline0.m(iIconCompatParcelizer2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.read & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        if (getcoordinatesaccessedduringplacement == null) {
            withComposeStackTrace withcomposestacktrace2 = withComposeStackTrace.write;
            withcomposestacktrace2.getClass();
            iIconCompatParcelizer = withcomposestacktrace2.RemoteActionCompatParcelizer(getClass()).IconCompatParcelizer(this);
        } else {
            iIconCompatParcelizer = getcoordinatesaccessedduringplacement.IconCompatParcelizer(this);
        }
        serializer(iIconCompatParcelizer);
        return iIconCompatParcelizer;
    }
}
