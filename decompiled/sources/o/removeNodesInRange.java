package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.huawei.location.Vw$Vw;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class removeNodesInRange {
    public static final removeNodesInRange RemoteActionCompatParcelizer;
    public static final removeNodesInRange read;
    public static final removeNodesInRange write;
    public final /* synthetic */ int IconCompatParcelizer;
    public final Object serializer;

    public removeNodesInRange(LayoutModifierNodemaxIntrinsicWidth1 layoutModifierNodemaxIntrinsicWidth1, Class cls) {
        this.IconCompatParcelizer = 2;
        if (layoutModifierNodemaxIntrinsicWidth1.write.keySet().contains(cls) || Void.class.equals(cls)) {
            this.serializer = layoutModifierNodemaxIntrinsicWidth1;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m("Given internalKeyMananger ", layoutModifierNodemaxIntrinsicWidth1.toString(), " does not support primitive class ", cls.getName()));
            throw null;
        }
    }

    public androidx.emoji2.text.EmojiProcessor read() {
        androidx.emoji2.text.EmojiProcessor emojiProcessorIconCompatParcelizer;
        synchronized (this) {
            emojiProcessorIconCompatParcelizer = androidx.emoji2.text.EmojiProcessor.IconCompatParcelizer((Keyset) ((lookaheadReplaceui) this.serializer).MediaBrowserCompatMediaItem());
        }
        return emojiProcessorIconCompatParcelizer;
    }

    public Keyset.Key read(KeyData keyData, requestRemeasureui requestremeasureui) {
        int iWrite;
        synchronized (this) {
            synchronized (this) {
                iWrite = invalidateMeasurement.write();
                while (serializer(iWrite)) {
                    iWrite = invalidateMeasurement.write();
                }
            }
            return (Keyset.Key) marklookaheadmeasurependinguiIconCompatParcelizer.MediaBrowserCompatMediaItem();
        }
        if (requestremeasureui == requestRemeasureui.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        markLookaheadMeasurePendingui marklookaheadmeasurependinguiIconCompatParcelizer = Keyset.Key.IconCompatParcelizer();
        marklookaheadmeasurependinguiIconCompatParcelizer.read(keyData);
        marklookaheadmeasurependinguiIconCompatParcelizer.IconCompatParcelizer(iWrite);
        marklookaheadmeasurependinguiIconCompatParcelizer.write(isSemanticsInvalidatedui.ENABLED);
        marklookaheadmeasurependinguiIconCompatParcelizer.serializer(requestremeasureui);
        return (Keyset.Key) marklookaheadmeasurependinguiIconCompatParcelizer.MediaBrowserCompatMediaItem();
    }

    public void serializer(isPlacedInLookahead isplacedinlookahead) {
        Keyset.Key key;
        synchronized (this) {
            synchronized (this) {
                key = read(removeFirst.RemoteActionCompatParcelizer(isplacedinlookahead), isplacedinlookahead.write());
            }
        }
        lookaheadReplaceui lookaheadreplaceui = (lookaheadReplaceui) this.serializer;
        lookaheadreplaceui.MediaMetadataCompat();
        Keyset.IconCompatParcelizer((Keyset) lookaheadreplaceui.read, key);
    }

    public boolean serializer(int i) {
        synchronized (this) {
            Iterator it = Collections.unmodifiableList(((Keyset) ((lookaheadReplaceui) this.serializer).read).RemoteActionCompatParcelizer()).iterator();
            while (it.hasNext()) {
                if (((Keyset.Key) it.next()).serializer() == i) {
                    return true;
                }
            }
            return false;
        }
    }

    public KeyData IconCompatParcelizer(setOnAttachui setonattachui) throws GeneralSecurityException {
        LayoutModifierNodemaxIntrinsicWidth1 layoutModifierNodemaxIntrinsicWidth1 = (LayoutModifierNodemaxIntrinsicWidth1) this.serializer;
        try {
            setInteropViewFactoryHolderui setinteropviewfactoryholderuiIconCompatParcelizer = new PinnableContainerKtLocalPinnableContainer1(20, layoutModifierNodemaxIntrinsicWidth1.IconCompatParcelizer()).IconCompatParcelizer(setonattachui);
            invalidateMeasurementsui invalidatemeasurementsuiSerializer = KeyData.serializer();
            invalidatemeasurementsuiSerializer.read(layoutModifierNodemaxIntrinsicWidth1.read());
            try {
                Vw$Vw vw$Vw = new Vw$Vw(((GeneratedMessageLite) setinteropviewfactoryholderuiIconCompatParcelizer).write(null), 5);
                setinteropviewfactoryholderuiIconCompatParcelizer.serializer(vw$Vw.IconCompatParcelizer());
                invalidatemeasurementsuiSerializer.IconCompatParcelizer(vw$Vw.RemoteActionCompatParcelizer());
                invalidatemeasurementsuiSerializer.serializer(layoutModifierNodemaxIntrinsicWidth1.RemoteActionCompatParcelizer());
                return (KeyData) invalidatemeasurementsuiSerializer.MediaBrowserCompatMediaItem();
            } catch (IOException e) {
                throw new RuntimeException(setinteropviewfactoryholderuiIconCompatParcelizer.RemoteActionCompatParcelizer("ByteString"), e);
            }
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e2) {
            throw new GeneralSecurityException("Unexpected proto", e2);
        }
    }

    static {
        int i = 0;
        write = new removeNodesInRange(i, "ENABLED");
        RemoteActionCompatParcelizer = new removeNodesInRange(i, "DISABLED");
        read = new removeNodesInRange(i, "DESTROYED");
    }

    public String toString() {
        return this.IconCompatParcelizer != 0 ? super.toString() : (String) this.serializer;
    }

    public /* synthetic */ removeNodesInRange(int i, Object obj) {
        this.IconCompatParcelizer = i;
        this.serializer = obj;
    }
}
