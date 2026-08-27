package kotlinx.serialization.json.internal;

import androidx.room.Room;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.util.IntPair;
import com.google.android.gms.measurement.internal.zzgs;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.TuplesKt;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import o.DefaultInAppMessageModalViewFactoryCompanion;
import o.SwipeDismissTouchListener1;
import o.SwipeDismissTouchListenerVerticalDismissDirection;
import o.TouchAwareSwipeDismissTouchListener;
import o.applyDisplayCutoutMarginsToCloseButtonlambda0;
import o.createInAppMessageViewlambda1;
import o.displayInAppMessagelambda1;
import o.getCieXyz;
import o.getViewBoundsByType;
import o.handleLocalImagelambda1;
import o.hideCurrentlyDisplayingInAppMessage;
import o.lightingOWjLjI;
import o.onContentCardDismissed;
import o.prepareInAppMessageWithBitmapDownloadlambda1;
import o.prepareInAppMessageWithHtmllambda1;
import o.prepareInAppMessageWithZippedAssetHtml;
import o.prepareInAppMessagelambda2;
import o.r8lambda7TbKsIS1F2Je6e1BPmbF7ukhpw;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.r8lambdaOVm5S_u8QUSoMXvJUOeZHUBFeHc;
import o.r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k;
import o.r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0;
import o.removeNodeAtDepth;
import o.resetTransientState;
import o.resizeGraphicFrameIfAppropriate;
import o.setGraphicModalMaxWidthDp;
import o.setNativeShader;
import o.setTouchListener;
import okio.Options;

/* JADX INFO: loaded from: classes4.dex */
public final class StreamingJsonDecoder extends Options.Companion implements setTouchListener {
    public final resetTransientState IconCompatParcelizer;
    public final applyDisplayCutoutMarginsToCloseButtonlambda0 MediaBrowserCompatMediaItem;
    public final prepareInAppMessageWithHtmllambda1 MediaSessionCompatQueueItem;
    public final prepareInAppMessageWithZippedAssetHtml RatingCompat;
    public final SwipeDismissTouchListener1 RemoteActionCompatParcelizer;
    public lightingOWjLjI read;
    public int serializer;
    public final JsonElementMarker write;

    @Override // o.DefaultInAppMessageModalViewFactoryCompanion, o.createInAppMessageViewlambda1
    public final prepareInAppMessageWithZippedAssetHtml MediaSessionCompatQueueItem() {
        return this.RatingCompat;
    }

    @Override // okio.Options.Companion, o.DefaultInAppMessageModalViewFactoryCompanion
    public final boolean r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        JsonElementMarker jsonElementMarker = this.write;
        return (jsonElementMarker == null || !jsonElementMarker.read) && !this.MediaBrowserCompatMediaItem.serializer(true);
    }

    @Override // o.setTouchListener
    public final resetTransientState serializer() {
        return this.IconCompatParcelizer;
    }

    @Override // okio.Options.Companion, o.DefaultInAppMessageModalViewFactoryCompanion
    public final short ComponentActivity() {
        applyDisplayCutoutMarginsToCloseButtonlambda0 applydisplaycutoutmarginstoclosebuttonlambda0 = this.MediaBrowserCompatMediaItem;
        long jRemoteActionCompatParcelizer = applydisplaycutoutmarginstoclosebuttonlambda0.RemoteActionCompatParcelizer();
        short s = (short) jRemoteActionCompatParcelizer;
        if (jRemoteActionCompatParcelizer == s) {
            return s;
        }
        applyDisplayCutoutMarginsToCloseButtonlambda0.RemoteActionCompatParcelizer(applydisplaycutoutmarginstoclosebuttonlambda0, "Failed to parse short for input '" + jRemoteActionCompatParcelizer + '\'', 0, null, 6);
        throw null;
    }

    @Override // okio.Options.Companion, o.createInAppMessageViewlambda1
    public final Object IconCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i, setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp, Object obj) {
        resizeGraphicFrameIfAppropriate resizegraphicframeifappropriate = (resizeGraphicFrameIfAppropriate) this.MediaBrowserCompatMediaItem.executorServiceOrNull;
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        setgraphicmodalmaxwidthdp.getClass();
        boolean z = this.MediaSessionCompatQueueItem == prepareInAppMessageWithHtmllambda1.MAP && (i & 1) == 0;
        if (z) {
            int[] iArr = (int[]) resizegraphicframeifappropriate.write;
            int i2 = resizegraphicframeifappropriate.serializer;
            if (iArr[i2] == -2) {
                ((Object[]) resizegraphicframeifappropriate.read)[i2] = handleLocalImagelambda1.serializer;
            }
        }
        Object objWrite = write(setgraphicmodalmaxwidthdp);
        if (z) {
            int[] iArr2 = (int[]) resizegraphicframeifappropriate.write;
            int i3 = resizegraphicframeifappropriate.serializer;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                resizegraphicframeifappropriate.serializer = i4;
                if (i4 == ((Object[]) resizegraphicframeifappropriate.read).length) {
                    resizegraphicframeifappropriate.read();
                }
            }
            Object[] objArr = (Object[]) resizegraphicframeifappropriate.read;
            int i5 = resizegraphicframeifappropriate.serializer;
            objArr[i5] = objWrite;
            ((int[]) resizegraphicframeifappropriate.write)[i5] = -2;
        }
        return objWrite;
    }

    @Override // okio.Options.Companion, o.DefaultInAppMessageModalViewFactoryCompanion
    public final boolean MediaDescriptionCompat() {
        boolean z;
        boolean z2;
        applyDisplayCutoutMarginsToCloseButtonlambda0 applydisplaycutoutmarginstoclosebuttonlambda0 = this.MediaBrowserCompatMediaItem;
        int iParcelableVolumeInfo = applydisplaycutoutmarginstoclosebuttonlambda0.ParcelableVolumeInfo();
        String str = (String) applydisplaycutoutmarginstoclosebuttonlambda0.runningSyncCalls;
        if (iParcelableVolumeInfo == str.length()) {
            applyDisplayCutoutMarginsToCloseButtonlambda0.RemoteActionCompatParcelizer(applydisplaycutoutmarginstoclosebuttonlambda0, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iParcelableVolumeInfo) == '\"') {
            iParcelableVolumeInfo++;
            z = true;
        } else {
            z = false;
        }
        int iIconCompatParcelizer = applydisplaycutoutmarginstoclosebuttonlambda0.IconCompatParcelizer(iParcelableVolumeInfo);
        if (iIconCompatParcelizer >= str.length() || iIconCompatParcelizer == -1) {
            applyDisplayCutoutMarginsToCloseButtonlambda0.RemoteActionCompatParcelizer(applydisplaycutoutmarginstoclosebuttonlambda0, "EOF", 0, null, 6);
            throw null;
        }
        int i = iIconCompatParcelizer + 1;
        int iCharAt = str.charAt(iIconCompatParcelizer) | ' ';
        if (iCharAt == 102) {
            applydisplaycutoutmarginstoclosebuttonlambda0.write(i, "alse");
            z2 = false;
        } else {
            if (iCharAt != 116) {
                applyDisplayCutoutMarginsToCloseButtonlambda0.RemoteActionCompatParcelizer(applydisplaycutoutmarginstoclosebuttonlambda0, "Expected valid boolean literal prefix, but had '" + applydisplaycutoutmarginstoclosebuttonlambda0.MediaMetadataCompat() + '\'', 0, null, 6);
                throw null;
            }
            applydisplaycutoutmarginstoclosebuttonlambda0.write(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (applydisplaycutoutmarginstoclosebuttonlambda0.maxRequestsPerHost == str.length()) {
            applyDisplayCutoutMarginsToCloseButtonlambda0.RemoteActionCompatParcelizer(applydisplaycutoutmarginstoclosebuttonlambda0, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(applydisplaycutoutmarginstoclosebuttonlambda0.maxRequestsPerHost) == '\"') {
            applydisplaycutoutmarginstoclosebuttonlambda0.maxRequestsPerHost++;
            return z2;
        }
        applyDisplayCutoutMarginsToCloseButtonlambda0.RemoteActionCompatParcelizer(applydisplaycutoutmarginstoclosebuttonlambda0, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // okio.Options.Companion, o.DefaultInAppMessageModalViewFactoryCompanion
    public final char MediaSessionCompatResultReceiverWrapper() {
        applyDisplayCutoutMarginsToCloseButtonlambda0 applydisplaycutoutmarginstoclosebuttonlambda0 = this.MediaBrowserCompatMediaItem;
        String strMediaMetadataCompat = applydisplaycutoutmarginstoclosebuttonlambda0.MediaMetadataCompat();
        if (strMediaMetadataCompat.length() == 1) {
            return strMediaMetadataCompat.charAt(0);
        }
        applyDisplayCutoutMarginsToCloseButtonlambda0.RemoteActionCompatParcelizer(applydisplaycutoutmarginstoclosebuttonlambda0, m1$$ExternalSyntheticOutline0.m('\'', "Expected single char, but got '", strMediaMetadataCompat), 0, null, 6);
        throw null;
    }

    @Override // okio.Options.Companion, o.DefaultInAppMessageModalViewFactoryCompanion
    public final int MediaSessionCompatToken() {
        applyDisplayCutoutMarginsToCloseButtonlambda0 applydisplaycutoutmarginstoclosebuttonlambda0 = this.MediaBrowserCompatMediaItem;
        long jRemoteActionCompatParcelizer = applydisplaycutoutmarginstoclosebuttonlambda0.RemoteActionCompatParcelizer();
        int i = (int) jRemoteActionCompatParcelizer;
        if (jRemoteActionCompatParcelizer == i) {
            return i;
        }
        applyDisplayCutoutMarginsToCloseButtonlambda0.RemoteActionCompatParcelizer(applydisplaycutoutmarginstoclosebuttonlambda0, "Failed to parse int for input '" + jRemoteActionCompatParcelizer + '\'', 0, null, 6);
        throw null;
    }

    @Override // okio.Options.Companion, o.DefaultInAppMessageModalViewFactoryCompanion
    public final double ParcelableVolumeInfo() {
        applyDisplayCutoutMarginsToCloseButtonlambda0 applydisplaycutoutmarginstoclosebuttonlambda0 = this.MediaBrowserCompatMediaItem;
        String strMediaMetadataCompat = applydisplaycutoutmarginstoclosebuttonlambda0.MediaMetadataCompat();
        try {
            double d = Double.parseDouble(strMediaMetadataCompat);
            if (Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            Object[] objArr = {applydisplaycutoutmarginstoclosebuttonlambda0, Double.valueOf(d)};
            int iRemoteActionCompatParcelizer = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
            IntPair.RemoteActionCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1265782582, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr, iRemoteActionCompatParcelizer, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1265782583);
            throw null;
        } catch (IllegalArgumentException unused) {
            applyDisplayCutoutMarginsToCloseButtonlambda0.RemoteActionCompatParcelizer(applydisplaycutoutmarginstoclosebuttonlambda0, m1$$ExternalSyntheticOutline0.m('\'', "Failed to parse type 'double' for input '", strMediaMetadataCompat), 0, null, 6);
            throw null;
        }
    }

    @Override // okio.Options.Companion, o.DefaultInAppMessageModalViewFactoryCompanion
    public final float PlaybackStateCompat() {
        applyDisplayCutoutMarginsToCloseButtonlambda0 applydisplaycutoutmarginstoclosebuttonlambda0 = this.MediaBrowserCompatMediaItem;
        String strMediaMetadataCompat = applydisplaycutoutmarginstoclosebuttonlambda0.MediaMetadataCompat();
        try {
            float f = Float.parseFloat(strMediaMetadataCompat);
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            Object[] objArr = {applydisplaycutoutmarginstoclosebuttonlambda0, Float.valueOf(f)};
            int iRemoteActionCompatParcelizer = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
            IntPair.RemoteActionCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1265782582, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr, iRemoteActionCompatParcelizer, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1265782583);
            throw null;
        } catch (IllegalArgumentException unused) {
            applyDisplayCutoutMarginsToCloseButtonlambda0.RemoteActionCompatParcelizer(applydisplaycutoutmarginstoclosebuttonlambda0, m1$$ExternalSyntheticOutline0.m('\'', "Failed to parse type 'float' for input '", strMediaMetadataCompat), 0, null, 6);
            throw null;
        }
    }

    @Override // okio.Options.Companion, o.DefaultInAppMessageModalViewFactoryCompanion
    public final byte PlaybackStateCompatCustomAction() {
        applyDisplayCutoutMarginsToCloseButtonlambda0 applydisplaycutoutmarginstoclosebuttonlambda0 = this.MediaBrowserCompatMediaItem;
        long jRemoteActionCompatParcelizer = applydisplaycutoutmarginstoclosebuttonlambda0.RemoteActionCompatParcelizer();
        byte b = (byte) jRemoteActionCompatParcelizer;
        if (jRemoteActionCompatParcelizer == b) {
            return b;
        }
        applyDisplayCutoutMarginsToCloseButtonlambda0.RemoteActionCompatParcelizer(applydisplaycutoutmarginstoclosebuttonlambda0, "Failed to parse byte for input '" + jRemoteActionCompatParcelizer + '\'', 0, null, 6);
        throw null;
    }

    @Override // okio.Options.Companion, o.DefaultInAppMessageModalViewFactoryCompanion
    public final String ResultReceiver() {
        boolean z = this.RemoteActionCompatParcelizer.MediaMetadataCompat;
        applyDisplayCutoutMarginsToCloseButtonlambda0 applydisplaycutoutmarginstoclosebuttonlambda0 = this.MediaBrowserCompatMediaItem;
        return z ? applydisplaycutoutmarginstoclosebuttonlambda0.MediaDescriptionCompat() : applydisplaycutoutmarginstoclosebuttonlambda0.write();
    }

    @Override // okio.Options.Companion, o.DefaultInAppMessageModalViewFactoryCompanion
    public final long r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
        return this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer();
    }

    @Override // o.setTouchListener
    public final SwipeDismissTouchListenerVerticalDismissDirection read() {
        return new zzgs(this.IconCompatParcelizer.IconCompatParcelizer, this.MediaBrowserCompatMediaItem).RemoteActionCompatParcelizer();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0110  */
    /* JADX WARN: Code duplicated, block: B:35:0x0111  */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x0111, please report this as an issue */
    @Override // okio.Options.Companion, o.DefaultInAppMessageModalViewFactoryCompanion
    public final Object write(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp) {
        String message;
        resetTransientState resettransientstate = this.IconCompatParcelizer;
        applyDisplayCutoutMarginsToCloseButtonlambda0 applydisplaycutoutmarginstoclosebuttonlambda0 = this.MediaBrowserCompatMediaItem;
        resizeGraphicFrameIfAppropriate resizegraphicframeifappropriate = (resizeGraphicFrameIfAppropriate) applydisplaycutoutmarginstoclosebuttonlambda0.executorServiceOrNull;
        setgraphicmodalmaxwidthdp.getClass();
        try {
            if (!(setgraphicmodalmaxwidthdp instanceof AbstractPolymorphicSerializer)) {
                return setgraphicmodalmaxwidthdp.deserialize(this);
            }
            String strWrite = LazyKt__LazyJVMKt.write(((AbstractPolymorphicSerializer) setgraphicmodalmaxwidthdp).getDescriptor(), resettransientstate);
            String strIconCompatParcelizer = applydisplaycutoutmarginstoclosebuttonlambda0.IconCompatParcelizer(strWrite, this.RemoteActionCompatParcelizer.MediaMetadataCompat);
            String strIconCompatParcelizer2 = null;
            if (strIconCompatParcelizer != null) {
                try {
                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpIconCompatParcelizer = TuplesKt.IconCompatParcelizer((AbstractPolymorphicSerializer) setgraphicmodalmaxwidthdp, this, strIconCompatParcelizer);
                    lightingOWjLjI lightingowjlji = new lightingOWjLjI();
                    lightingowjlji.write = strWrite;
                    this.read = lightingowjlji;
                    return setgraphicmodalmaxwidthdpIconCompatParcelizer.deserialize(this);
                } catch (SerializationException e) {
                    String message2 = e.getMessage();
                    message2.getClass();
                    String strRemoteActionCompatParcelizer = hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer(message2, '\n'), ".");
                    String message3 = e.getMessage();
                    message3.getClass();
                    applyDisplayCutoutMarginsToCloseButtonlambda0.RemoteActionCompatParcelizer(applydisplaycutoutmarginstoclosebuttonlambda0, strRemoteActionCompatParcelizer, 0, hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer('\n', message3, ""), 2);
                    throw null;
                }
            }
            String strWrite2 = LazyKt__LazyJVMKt.write(((AbstractPolymorphicSerializer) setgraphicmodalmaxwidthdp).getDescriptor(), resettransientstate);
            SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection = read();
            String strSerializer = ((AbstractPolymorphicSerializer) setgraphicmodalmaxwidthdp).getDescriptor().serializer();
            if (!(swipeDismissTouchListenerVerticalDismissDirection instanceof r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k)) {
                throw IntPair.IconCompatParcelizer(swipeDismissTouchListenerVerticalDismissDirection.toString(), -1, "Expected " + displayInAppMessagelambda1.serializer(r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k.class).IconCompatParcelizer() + ", but had " + displayInAppMessagelambda1.serializer(swipeDismissTouchListenerVerticalDismissDirection.getClass()).IconCompatParcelizer() + " as the serialized body of " + strSerializer + " at element: " + resizegraphicframeifappropriate.write());
            }
            r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k r8lambdaerwhggzq_gqgn8cultnvrcshm8k = (r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k) swipeDismissTouchListenerVerticalDismissDirection;
            SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection2 = (SwipeDismissTouchListenerVerticalDismissDirection) r8lambdaerwhggzq_gqgn8cultnvrcshm8k.get(strWrite2);
            if (swipeDismissTouchListenerVerticalDismissDirection2 != null) {
                r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0 r8lambdagbekcaskecamm7h9dyqnzofon0 = TouchAwareSwipeDismissTouchListener.read(swipeDismissTouchListenerVerticalDismissDirection2);
                if (!(r8lambdagbekcaskecamm7h9dyqnzofon0 instanceof r8lambdaOVm5S_u8QUSoMXvJUOeZHUBFeHc)) {
                    strIconCompatParcelizer2 = r8lambdagbekcaskecamm7h9dyqnzofon0.IconCompatParcelizer();
                }
            }
            try {
                return setNativeShader.read(resettransientstate, strWrite2, r8lambdaerwhggzq_gqgn8cultnvrcshm8k, TuplesKt.IconCompatParcelizer((AbstractPolymorphicSerializer) setgraphicmodalmaxwidthdp, this, strIconCompatParcelizer2));
            } catch (SerializationException e2) {
                String message4 = e2.getMessage();
                message4.getClass();
                throw IntPair.IconCompatParcelizer(r8lambdaerwhggzq_gqgn8cultnvrcshm8k.toString(), -1, message4);
            }
            message = e.getMessage();
            message.getClass();
            if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) message, (CharSequence) "at path", false)) {
                throw e;
            }
            throw new MissingFieldException(e.RemoteActionCompatParcelizer, e.getMessage() + " at path: " + resizegraphicframeifappropriate.write(), e);
        } catch (MissingFieldException e3) {
            message = e3.getMessage();
            message.getClass();
            if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) message, (CharSequence) "at path", false)) {
                throw e3;
            }
            throw new MissingFieldException(e3.RemoteActionCompatParcelizer, e3.getMessage() + " at path: " + resizegraphicframeifappropriate.write(), e3);
        }
    }

    public StreamingJsonDecoder(resetTransientState resettransientstate, prepareInAppMessageWithHtmllambda1 prepareinappmessagewithhtmllambda1, applyDisplayCutoutMarginsToCloseButtonlambda0 applydisplaycutoutmarginstoclosebuttonlambda0, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, lightingOWjLjI lightingowjlji) {
        prepareinappmessagewithhtmllambda1.getClass();
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        this.IconCompatParcelizer = resettransientstate;
        this.MediaSessionCompatQueueItem = prepareinappmessagewithhtmllambda1;
        this.MediaBrowserCompatMediaItem = applydisplaycutoutmarginstoclosebuttonlambda0;
        this.RatingCompat = resettransientstate.RemoteActionCompatParcelizer;
        this.serializer = -1;
        this.read = lightingowjlji;
        SwipeDismissTouchListener1 swipeDismissTouchListener1 = resettransientstate.IconCompatParcelizer;
        this.RemoteActionCompatParcelizer = swipeDismissTouchListener1;
        this.write = swipeDismissTouchListener1.RatingCompat ? null : new JsonElementMarker(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // okio.Options.Companion, o.DefaultInAppMessageModalViewFactoryCompanion
    public final int IconCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        return JsonNamesMapKt.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, this.IconCompatParcelizer, ResultReceiver(), " at path ".concat(((resizeGraphicFrameIfAppropriate) this.MediaBrowserCompatMediaItem.executorServiceOrNull).write()));
    }

    @Override // okio.Options.Companion, o.DefaultInAppMessageModalViewFactoryCompanion
    public final DefaultInAppMessageModalViewFactoryCompanion RemoteActionCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        return prepareInAppMessageWithBitmapDownloadlambda1.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda) ? new getViewBoundsByType(this.MediaBrowserCompatMediaItem, this.IconCompatParcelizer) : this;
    }

    @Override // okio.Options.Companion, o.DefaultInAppMessageModalViewFactoryCompanion
    public final createInAppMessageViewlambda1 serializer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        resetTransientState resettransientstate = this.IconCompatParcelizer;
        prepareInAppMessageWithHtmllambda1 prepareinappmessagewithhtmllambda1RemoteActionCompatParcelizer = Room.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, resettransientstate);
        applyDisplayCutoutMarginsToCloseButtonlambda0 applydisplaycutoutmarginstoclosebuttonlambda0 = this.MediaBrowserCompatMediaItem;
        resizeGraphicFrameIfAppropriate resizegraphicframeifappropriate = (resizeGraphicFrameIfAppropriate) applydisplaycutoutmarginstoclosebuttonlambda0.executorServiceOrNull;
        int i = resizegraphicframeifappropriate.serializer + 1;
        resizegraphicframeifappropriate.serializer = i;
        if (i == ((Object[]) resizegraphicframeifappropriate.read).length) {
            resizegraphicframeifappropriate.read();
        }
        ((Object[]) resizegraphicframeifappropriate.read)[i] = r8lambda92m0p9sit5uf70mvjf4rwmruda;
        applydisplaycutoutmarginstoclosebuttonlambda0.read(prepareinappmessagewithhtmllambda1RemoteActionCompatParcelizer.begin);
        if (applydisplaycutoutmarginstoclosebuttonlambda0.MediaBrowserCompatMediaItem() == 4) {
            applyDisplayCutoutMarginsToCloseButtonlambda0.RemoteActionCompatParcelizer(applydisplaycutoutmarginstoclosebuttonlambda0, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        int i2 = prepareInAppMessagelambda2.write[prepareinappmessagewithhtmllambda1RemoteActionCompatParcelizer.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return new StreamingJsonDecoder(resettransientstate, prepareinappmessagewithhtmllambda1RemoteActionCompatParcelizer, applydisplaycutoutmarginstoclosebuttonlambda0, r8lambda92m0p9sit5uf70mvjf4rwmruda, this.read);
        }
        return (this.MediaSessionCompatQueueItem == prepareinappmessagewithhtmllambda1RemoteActionCompatParcelizer && resettransientstate.IconCompatParcelizer.RatingCompat) ? this : new StreamingJsonDecoder(resettransientstate, prepareinappmessagewithhtmllambda1RemoteActionCompatParcelizer, applydisplaycutoutmarginstoclosebuttonlambda0, r8lambda92m0p9sit5uf70mvjf4rwmruda, this.read);
    }

    @Override // okio.Options.Companion, o.createInAppMessageViewlambda1
    public final void write(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        int iIconCompatParcelizer = r8lambda92m0p9sit5uf70mvjf4rwmruda.IconCompatParcelizer();
        resetTransientState resettransientstate = this.IconCompatParcelizer;
        if (iIconCompatParcelizer == 0 && JsonNamesMapKt.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, resettransientstate)) {
            while (read(r8lambda92m0p9sit5uf70mvjf4rwmruda) != -1) {
            }
        }
        applyDisplayCutoutMarginsToCloseButtonlambda0 applydisplaycutoutmarginstoclosebuttonlambda0 = this.MediaBrowserCompatMediaItem;
        if (applydisplaycutoutmarginstoclosebuttonlambda0.PlaybackStateCompat() && !resettransientstate.IconCompatParcelizer.IconCompatParcelizer) {
            IntPair.serializer(applydisplaycutoutmarginstoclosebuttonlambda0, "");
            throw null;
        }
        applydisplaycutoutmarginstoclosebuttonlambda0.read(this.MediaSessionCompatQueueItem.end);
        resizeGraphicFrameIfAppropriate resizegraphicframeifappropriate = (resizeGraphicFrameIfAppropriate) applydisplaycutoutmarginstoclosebuttonlambda0.executorServiceOrNull;
        int i = resizegraphicframeifappropriate.serializer;
        int[] iArr = (int[]) resizegraphicframeifappropriate.write;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            resizegraphicframeifappropriate.serializer = i - 1;
        }
        int i2 = resizegraphicframeifappropriate.serializer;
        if (i2 != -1) {
            resizegraphicframeifappropriate.serializer = i2 - 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:146:0x02af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:149:0x02b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:151:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:153:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:156:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:159:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:188:0x0263 A[EDGE_INSN: B:188:0x0263->B:121:0x0263 BREAK  A[LOOP:1: B:89:0x01d6->B:190:0x01d6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x01d6 A[SYNTHETIC] */
    @Override // o.createInAppMessageViewlambda1
    public final int read(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        prepareInAppMessageWithHtmllambda1 prepareinappmessagewithhtmllambda1;
        boolean zPlaybackStateCompat;
        int i;
        int i2;
        String strSerializer;
        boolean z;
        boolean zPlaybackStateCompat2;
        boolean z2;
        char c;
        int i3;
        int i4;
        String strIconCompatParcelizer;
        resetTransientState resettransientstate = this.IconCompatParcelizer;
        SwipeDismissTouchListener1 swipeDismissTouchListener1 = resettransientstate.IconCompatParcelizer;
        applyDisplayCutoutMarginsToCloseButtonlambda0 applydisplaycutoutmarginstoclosebuttonlambda0 = this.MediaBrowserCompatMediaItem;
        resizeGraphicFrameIfAppropriate resizegraphicframeifappropriate = (resizeGraphicFrameIfAppropriate) applydisplaycutoutmarginstoclosebuttonlambda0.executorServiceOrNull;
        String str = (String) applydisplaycutoutmarginstoclosebuttonlambda0.runningSyncCalls;
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        int[] iArr = prepareInAppMessagelambda2.write;
        prepareInAppMessageWithHtmllambda1 prepareinappmessagewithhtmllambda2 = this.MediaSessionCompatQueueItem;
        int i5 = iArr[prepareinappmessagewithhtmllambda2.ordinal()];
        boolean z3 = true;
        int iIconCompatParcelizer = -1;
        if (i5 == 2) {
            prepareinappmessagewithhtmllambda1 = prepareinappmessagewithhtmllambda2;
            int i6 = this.serializer;
            boolean z4 = i6 % 2 != 0;
            if (!z4) {
                applydisplaycutoutmarginstoclosebuttonlambda0.read(':');
            } else {
                if (i6 != -1) {
                    zPlaybackStateCompat = applydisplaycutoutmarginstoclosebuttonlambda0.PlaybackStateCompat();
                }
                if (applydisplaycutoutmarginstoclosebuttonlambda0.read()) {
                    if (z4) {
                        i = this.serializer;
                        i2 = applydisplaycutoutmarginstoclosebuttonlambda0.maxRequestsPerHost;
                        if (i == -1) {
                            if (zPlaybackStateCompat) {
                                applyDisplayCutoutMarginsToCloseButtonlambda0.RemoteActionCompatParcelizer(applydisplaycutoutmarginstoclosebuttonlambda0, "Unexpected leading comma", i2, null, 4);
                                throw null;
                            }
                        } else if (!zPlaybackStateCompat) {
                            applyDisplayCutoutMarginsToCloseButtonlambda0.RemoteActionCompatParcelizer(applydisplaycutoutmarginstoclosebuttonlambda0, "Expected comma after the key-value pair", i2, null, 4);
                            throw null;
                        }
                    }
                    iIconCompatParcelizer = this.serializer + 1;
                    this.serializer = iIconCompatParcelizer;
                } else {
                    if (!zPlaybackStateCompat && !swipeDismissTouchListener1.IconCompatParcelizer) {
                        IntPair.serializer(applydisplaycutoutmarginstoclosebuttonlambda0, "object");
                        throw null;
                    }
                    iIconCompatParcelizer = -1;
                }
            }
            zPlaybackStateCompat = false;
            if (applydisplaycutoutmarginstoclosebuttonlambda0.read()) {
                if (z4) {
                    i = this.serializer;
                    i2 = applydisplaycutoutmarginstoclosebuttonlambda0.maxRequestsPerHost;
                    if (i == -1) {
                        if (zPlaybackStateCompat) {
                            applyDisplayCutoutMarginsToCloseButtonlambda0.RemoteActionCompatParcelizer(applydisplaycutoutmarginstoclosebuttonlambda0, "Unexpected leading comma", i2, null, 4);
                            throw null;
                        }
                    } else if (!zPlaybackStateCompat) {
                        applyDisplayCutoutMarginsToCloseButtonlambda0.RemoteActionCompatParcelizer(applydisplaycutoutmarginstoclosebuttonlambda0, "Expected comma after the key-value pair", i2, null, 4);
                        throw null;
                    }
                }
                iIconCompatParcelizer = this.serializer + 1;
                this.serializer = iIconCompatParcelizer;
            } else {
                if (!zPlaybackStateCompat) {
                }
                iIconCompatParcelizer = -1;
            }
        } else if (i5 != 4) {
            boolean zPlaybackStateCompat3 = applydisplaycutoutmarginstoclosebuttonlambda0.PlaybackStateCompat();
            if (applydisplaycutoutmarginstoclosebuttonlambda0.read()) {
                int i7 = this.serializer;
                if (i7 != -1 && !zPlaybackStateCompat3) {
                    applyDisplayCutoutMarginsToCloseButtonlambda0.RemoteActionCompatParcelizer(applydisplaycutoutmarginstoclosebuttonlambda0, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                iIconCompatParcelizer = i7 + 1;
                this.serializer = iIconCompatParcelizer;
            } else if (zPlaybackStateCompat3 && !swipeDismissTouchListener1.IconCompatParcelizer) {
                IntPair.serializer(applydisplaycutoutmarginstoclosebuttonlambda0, "array");
                throw null;
            }
            prepareinappmessagewithhtmllambda1 = prepareinappmessagewithhtmllambda2;
        } else {
            boolean zPlaybackStateCompat4 = applydisplaycutoutmarginstoclosebuttonlambda0.PlaybackStateCompat();
            while (true) {
                boolean z5 = applydisplaycutoutmarginstoclosebuttonlambda0.read();
                JsonElementMarker jsonElementMarker = this.write;
                if (z5) {
                    SwipeDismissTouchListener1 swipeDismissTouchListener2 = this.RemoteActionCompatParcelizer;
                    boolean z6 = swipeDismissTouchListener2.MediaMetadataCompat;
                    if (z6) {
                        strSerializer = applydisplaycutoutmarginstoclosebuttonlambda0.MediaDescriptionCompat();
                    } else {
                        strSerializer = applydisplaycutoutmarginstoclosebuttonlambda0.serializer();
                    }
                    String str2 = strSerializer;
                    applydisplaycutoutmarginstoclosebuttonlambda0.read(':');
                    int iSerializer = JsonNamesMapKt.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, resettransientstate, str2);
                    if (iSerializer != -3) {
                        if (swipeDismissTouchListener2.RemoteActionCompatParcelizer) {
                            boolean zWrite = r8lambda92m0p9sit5uf70mvjf4rwmruda.write(iSerializer);
                            r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmrudaRemoteActionCompatParcelizer = r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer(iSerializer);
                            if (zWrite && !r8lambda92m0p9sit5uf70mvjf4rwmrudaRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem() && applydisplaycutoutmarginstoclosebuttonlambda0.serializer(z3)) {
                                prepareinappmessagewithhtmllambda1 = prepareinappmessagewithhtmllambda2;
                            } else {
                                prepareinappmessagewithhtmllambda1 = prepareinappmessagewithhtmllambda2;
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{r8lambda92m0p9sit5uf70mvjf4rwmrudaRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(), r8lambda7TbKsIS1F2Je6e1BPmbF7ukhpw.IconCompatParcelizer}, getCieXyz.write())).booleanValue() && ((!r8lambda92m0p9sit5uf70mvjf4rwmrudaRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem() || !applydisplaycutoutmarginstoclosebuttonlambda0.serializer(false)) && (strIconCompatParcelizer = applydisplaycutoutmarginstoclosebuttonlambda0.IconCompatParcelizer(z6)) != null)) {
                                    int iSerializer2 = JsonNamesMapKt.serializer(r8lambda92m0p9sit5uf70mvjf4rwmrudaRemoteActionCompatParcelizer, resettransientstate, strIconCompatParcelizer);
                                    boolean z7 = !swipeDismissTouchListener1.RatingCompat && r8lambda92m0p9sit5uf70mvjf4rwmrudaRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem();
                                    if (iSerializer2 == -3 && (zWrite || z7)) {
                                        applydisplaycutoutmarginstoclosebuttonlambda0.write();
                                    }
                                }
                            }
                            zPlaybackStateCompat2 = applydisplaycutoutmarginstoclosebuttonlambda0.PlaybackStateCompat();
                            z = false;
                        } else {
                            prepareinappmessagewithhtmllambda1 = prepareinappmessagewithhtmllambda2;
                        }
                        if (jsonElementMarker != null) {
                            jsonElementMarker.serializer.write(iSerializer);
                        }
                        iIconCompatParcelizer = iSerializer;
                    } else {
                        prepareinappmessagewithhtmllambda1 = prepareinappmessagewithhtmllambda2;
                        z = true;
                        zPlaybackStateCompat2 = false;
                    }
                    if (z) {
                        if (!JsonNamesMapKt.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, resettransientstate)) {
                            lightingOWjLjI lightingowjlji = this.read;
                            if (lightingowjlji != null) {
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{lightingowjlji.write, str2}, getCieXyz.write())).booleanValue()) {
                                    lightingowjlji.write = null;
                                }
                            }
                            int i8 = resizegraphicframeifappropriate.serializer;
                            int[] iArr2 = (int[]) resizegraphicframeifappropriate.write;
                            if (iArr2[i8] == -2) {
                                i4 = -1;
                                iArr2[i8] = -1;
                                i3 = 1;
                                resizegraphicframeifappropriate.serializer = i8 - 1;
                            } else {
                                i3 = 1;
                                i4 = -1;
                            }
                            int i9 = resizegraphicframeifappropriate.serializer;
                            if (i9 != i4) {
                                resizegraphicframeifappropriate.serializer = i9 - i3;
                            }
                            int iWrite = hideCurrentlyDisplayingInAppMessage.write(6, str.subSequence(0, applydisplaycutoutmarginstoclosebuttonlambda0.maxRequestsPerHost).toString(), str2);
                            StringBuilder sbM = m1$$ExternalSyntheticOutline0.m("Encountered an unknown key '", iWrite, str2, "' at offset ", " at path: ");
                            sbM.append(resizegraphicframeifappropriate.write());
                            sbM.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
                            sbM.append(IntPair.RemoteActionCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1928934327, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{Integer.valueOf(iWrite), str}, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1928934330));
                            throw new JsonDecodingException(sbM.toString());
                        }
                        ArrayList arrayList = new ArrayList();
                        byte bMediaBrowserCompatMediaItem = applydisplaycutoutmarginstoclosebuttonlambda0.MediaBrowserCompatMediaItem();
                        if (bMediaBrowserCompatMediaItem == 8 || bMediaBrowserCompatMediaItem == 6) {
                            while (true) {
                                byte bMediaBrowserCompatMediaItem2 = applydisplaycutoutmarginstoclosebuttonlambda0.MediaBrowserCompatMediaItem();
                                if (bMediaBrowserCompatMediaItem2 != 1) {
                                    if (bMediaBrowserCompatMediaItem2 != 8) {
                                        if (bMediaBrowserCompatMediaItem2 == 6) {
                                            c = 6;
                                            z2 = false;
                                        } else {
                                            if (bMediaBrowserCompatMediaItem2 == 9) {
                                                if (((Number) onContentCardDismissed.MediaDescriptionCompat((List) arrayList)).byteValue() == 8) {
                                                    onContentCardDismissed.MediaSessionCompatQueueItem((List) arrayList);
                                                } else {
                                                    throw IntPair.IconCompatParcelizer(str, applydisplaycutoutmarginstoclosebuttonlambda0.maxRequestsPerHost, "found ] instead of } at path: " + resizegraphicframeifappropriate);
                                                }
                                            } else if (bMediaBrowserCompatMediaItem2 == 7) {
                                                if (((Number) onContentCardDismissed.MediaDescriptionCompat((List) arrayList)).byteValue() == 6) {
                                                    onContentCardDismissed.MediaSessionCompatQueueItem((List) arrayList);
                                                } else {
                                                    throw IntPair.IconCompatParcelizer(str, applydisplaycutoutmarginstoclosebuttonlambda0.maxRequestsPerHost, "found } instead of ] at path: " + resizegraphicframeifappropriate);
                                                }
                                            } else if (bMediaBrowserCompatMediaItem2 == 10) {
                                                applyDisplayCutoutMarginsToCloseButtonlambda0.RemoteActionCompatParcelizer(applydisplaycutoutmarginstoclosebuttonlambda0, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                                throw null;
                                            }
                                            z2 = false;
                                            c = 6;
                                        }
                                        applydisplaycutoutmarginstoclosebuttonlambda0.IconCompatParcelizer();
                                        if (arrayList.size() == 0) {
                                            break;
                                        }
                                    } else {
                                        z2 = false;
                                        c = 6;
                                    }
                                    arrayList.add(Byte.valueOf(bMediaBrowserCompatMediaItem2));
                                    applydisplaycutoutmarginstoclosebuttonlambda0.IconCompatParcelizer();
                                    if (arrayList.size() == 0) {
                                        break;
                                        break;
                                    }
                                } else if (z6) {
                                    applydisplaycutoutmarginstoclosebuttonlambda0.MediaMetadataCompat();
                                } else {
                                    applydisplaycutoutmarginstoclosebuttonlambda0.serializer();
                                }
                            }
                        } else {
                            applydisplaycutoutmarginstoclosebuttonlambda0.MediaMetadataCompat();
                            z2 = false;
                            c = 6;
                        }
                        zPlaybackStateCompat4 = applydisplaycutoutmarginstoclosebuttonlambda0.PlaybackStateCompat();
                    } else {
                        z2 = false;
                        c = 6;
                        zPlaybackStateCompat4 = zPlaybackStateCompat2;
                    }
                    prepareinappmessagewithhtmllambda2 = prepareinappmessagewithhtmllambda1;
                    z3 = true;
                } else {
                    prepareinappmessagewithhtmllambda1 = prepareinappmessagewithhtmllambda2;
                    if (zPlaybackStateCompat4 && !swipeDismissTouchListener1.IconCompatParcelizer) {
                        IntPair.serializer(applydisplaycutoutmarginstoclosebuttonlambda0, "object");
                        throw null;
                    }
                    iIconCompatParcelizer = jsonElementMarker != null ? jsonElementMarker.serializer.IconCompatParcelizer() : -1;
                }
            }
        }
        if (prepareinappmessagewithhtmllambda1 != prepareInAppMessageWithHtmllambda1.MAP) {
            ((int[]) resizegraphicframeifappropriate.write)[resizegraphicframeifappropriate.serializer] = iIconCompatParcelizer;
        }
        return iIconCompatParcelizer;
    }
}
