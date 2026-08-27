package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.TuplesKt;
import kotlin.collections.AbstractMap$$ExternalSyntheticLambda0;
import kotlin.text.RegexKt;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.json.internal.JsonNamesMapKt;

/* JADX INFO: loaded from: classes4.dex */
public class prepareInAppMessagelambda0 implements BackgroundInAppMessagePreparer {
    public final SwipeDismissTouchListener1 IconCompatParcelizer;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public final ArrayList RatingCompat;
    public final resetTransientState RemoteActionCompatParcelizer;
    public Object read;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM serializer;
    public final /* synthetic */ int write;

    @Override // o.BackgroundInAppMessagePreparer
    public final resetTransientState read() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.DefaultInAppMessageViewWrapperFactory
    public final void IconCompatParcelizer() {
        String str = (String) onContentCardDismissed.MediaBrowserCompatMediaItem((List) this.RatingCompat);
        if (str == null) {
            this.serializer.invoke(r8lambdaOVm5S_u8QUSoMXvJUOeZHUBFeHc.INSTANCE);
        } else {
            write(str, r8lambdaOVm5S_u8QUSoMXvJUOeZHUBFeHc.INSTANCE);
        }
    }

    public final void IconCompatParcelizer(Object obj, double d) {
        String str = (String) obj;
        str.getClass();
        write(str, TouchAwareSwipeDismissTouchListener.IconCompatParcelizer(Double.valueOf(d)));
        this.IconCompatParcelizer.getClass();
        if (Math.abs(d) <= Double.MAX_VALUE) {
            return;
        }
        String string = write().toString();
        string.getClass();
        throw new kotlinx.serialization.json.internal.JsonEncodingException(coil3.util.IntPair.read(Double.valueOf(d), str, string));
    }

    @Override // o.DefaultInAppMessageViewWrapperFactory
    public final prepareInAppMessageWithZippedAssetHtml MediaSessionCompatQueueItem() {
        return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
    }

    public final Object RemoteActionCompatParcelizer() {
        ArrayList arrayList = this.RatingCompat;
        if (!arrayList.isEmpty()) {
            return arrayList.remove(androidx.sqlite.SQLite.write((List) arrayList));
        }
        DrawableTransformation.serializer("No tag in stack for requested element");
        return null;
    }

    public final DefaultInAppMessageViewWrapperFactory RemoteActionCompatParcelizer(Object obj, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        String str = (String) obj;
        str.getClass();
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        if (prepareInAppMessageWithBitmapDownloadlambda1.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            return new r8lambdayMnp2OUs9TYBS_ac9p7jPOlc_lw(this, str);
        }
        if (prepareInAppMessageWithBitmapDownloadlambda1.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            return new r8lambdayMnp2OUs9TYBS_ac9p7jPOlc_lw(this, str, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        this.RatingCompat.add(str);
        return this;
    }

    public final void write(float f, Object obj) {
        String str = (String) obj;
        str.getClass();
        write(str, TouchAwareSwipeDismissTouchListener.IconCompatParcelizer(Float.valueOf(f)));
        this.IconCompatParcelizer.getClass();
        if (Math.abs(f) <= Float.MAX_VALUE) {
            return;
        }
        String string = write().toString();
        string.getClass();
        throw new kotlinx.serialization.json.internal.JsonEncodingException(coil3.util.IntPair.read(Float.valueOf(f), str, string));
    }

    public void write(String str, SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection) {
        int i = this.write;
        str.getClass();
        swipeDismissTouchListenerVerticalDismissDirection.getClass();
        if (i == 0) {
            ((LinkedHashMap) this.read).put(str, swipeDismissTouchListenerVerticalDismissDirection);
            return;
        }
        if (i != 1) {
            ((ArrayList) this.read).add(Integer.parseInt(str), swipeDismissTouchListenerVerticalDismissDirection);
        } else if (str != "primitive") {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("This output can only consume primitives with 'primitive' tag");
        } else if (((SwipeDismissTouchListenerVerticalDismissDirection) this.read) != null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
        } else {
            this.read = swipeDismissTouchListenerVerticalDismissDirection;
            this.serializer.invoke(swipeDismissTouchListenerVerticalDismissDirection);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public prepareInAppMessagelambda0(resetTransientState resettransientstate, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i) {
        this(resettransientstate, r8lambdaunavo3sxub_pc9xroryotnrlvsm, (char) 0);
        this.write = i;
        resettransientstate.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        if (i == 1) {
            this(resettransientstate, r8lambdaunavo3sxub_pc9xroryotnrlvsm, (char) 0);
            this.RatingCompat.add("primitive");
        } else if (i != 2) {
            this.read = new LinkedHashMap();
        } else {
            this(resettransientstate, r8lambdaunavo3sxub_pc9xroryotnrlvsm, (char) 0);
            this.read = new ArrayList();
        }
    }

    @Override // o.DefaultInAppMessageSlideupViewFactory
    public final DefaultInAppMessageViewWrapperFactory IconCompatParcelizer(onCloseActionlambda0 oncloseactionlambda0, int i) {
        oncloseactionlambda0.getClass();
        return RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(oncloseactionlambda0, i), oncloseactionlambda0.RemoteActionCompatParcelizer(i));
    }

    @Override // o.DefaultInAppMessageViewWrapperFactory
    public final void IconCompatParcelizer(String str) {
        str.getClass();
        String str2 = (String) RemoteActionCompatParcelizer();
        str2.getClass();
        write(str2, TouchAwareSwipeDismissTouchListener.IconCompatParcelizer(str));
    }

    @Override // o.BackgroundInAppMessagePreparer
    public final void IconCompatParcelizer(SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection) {
        swipeDismissTouchListenerVerticalDismissDirection.getClass();
        if (this.MediaDescriptionCompat == null || (swipeDismissTouchListenerVerticalDismissDirection instanceof r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k)) {
            read(r8lambda2svec8wazNIYAk5Hq146H0SPIb4.IconCompatParcelizer, swipeDismissTouchListenerVerticalDismissDirection);
        } else {
            LazyKt__LazyJVMKt.read(this.MediaMetadataCompat, swipeDismissTouchListenerVerticalDismissDirection);
            throw null;
        }
    }

    @Override // o.DefaultInAppMessageSlideupViewFactory
    public final void IconCompatParcelizer(onCloseActionlambda0 oncloseactionlambda0, int i, byte b) {
        oncloseactionlambda0.getClass();
        write(RemoteActionCompatParcelizer(oncloseactionlambda0, i), TouchAwareSwipeDismissTouchListener.IconCompatParcelizer(Byte.valueOf(b)));
    }

    @Override // o.DefaultInAppMessageSlideupViewFactory
    public final void IconCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        if (!this.RatingCompat.isEmpty()) {
            RemoteActionCompatParcelizer();
        }
        this.serializer.invoke(write());
    }

    @Override // o.DefaultInAppMessageSlideupViewFactory
    public final void IconCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i, double d) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        IconCompatParcelizer(RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, i), d);
    }

    @Override // o.DefaultInAppMessageSlideupViewFactory
    public final void IconCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i, setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp, Object obj) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        setgraphicmodalmaxwidthdp.getClass();
        this.RatingCompat.add(RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, i));
        read(setgraphicmodalmaxwidthdp, obj);
    }

    @Override // o.DefaultInAppMessageSlideupViewFactory
    public final void IconCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i, boolean z) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        write(RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, i), TouchAwareSwipeDismissTouchListener.write(Boolean.valueOf(z)));
    }

    public final String RemoteActionCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
        String strValueOf;
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        int i2 = this.write;
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        if (i2 != 2) {
            resetTransientState resettransientstate = this.RemoteActionCompatParcelizer;
            resettransientstate.getClass();
            JsonNamesMapKt.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, resettransientstate);
            strValueOf = r8lambda92m0p9sit5uf70mvjf4rwmruda.IconCompatParcelizer(i);
        } else {
            strValueOf = String.valueOf(i);
        }
        strValueOf.getClass();
        return strValueOf;
    }

    @Override // o.DefaultInAppMessageViewWrapperFactory
    public final DefaultInAppMessageViewWrapperFactory RemoteActionCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        if (onContentCardDismissed.MediaBrowserCompatMediaItem((List) this.RatingCompat) == null) {
            return new prepareInAppMessagelambda0(this.RemoteActionCompatParcelizer, this.serializer, 1).RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        if (this.MediaDescriptionCompat != null) {
            this.MediaMetadataCompat = r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer();
        }
        return RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(), r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.DefaultInAppMessageSlideupViewFactory
    public final void RemoteActionCompatParcelizer(onCloseActionlambda0 oncloseactionlambda0, int i, char c) {
        oncloseactionlambda0.getClass();
        write(RemoteActionCompatParcelizer(oncloseactionlambda0, i), TouchAwareSwipeDismissTouchListener.IconCompatParcelizer(String.valueOf(c)));
    }

    @Override // o.DefaultInAppMessageSlideupViewFactory
    public final void RemoteActionCompatParcelizer(onCloseActionlambda0 oncloseactionlambda0, int i, short s) {
        oncloseactionlambda0.getClass();
        write(RemoteActionCompatParcelizer(oncloseactionlambda0, i), TouchAwareSwipeDismissTouchListener.IconCompatParcelizer(Short.valueOf(s)));
    }

    @Override // o.DefaultInAppMessageSlideupViewFactory
    public final void RemoteActionCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i, long j) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        write(RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, i), TouchAwareSwipeDismissTouchListener.IconCompatParcelizer(Long.valueOf(j)));
    }

    public final void RemoteActionCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i, setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp, Object obj) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        setgraphicmodalmaxwidthdp.getClass();
        this.RatingCompat.add(RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, i));
        super.write(setgraphicmodalmaxwidthdp, obj);
    }

    @Override // o.DefaultInAppMessageViewWrapperFactory
    public final void read(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        String str = (String) RemoteActionCompatParcelizer();
        str.getClass();
        write(str, TouchAwareSwipeDismissTouchListener.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda.IconCompatParcelizer(i)));
    }

    @Override // o.DefaultInAppMessageViewWrapperFactory
    public final void read(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp, Object obj) {
        String strWrite;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2 = setgraphicmodalmaxwidthdp;
        setgraphicmodalmaxwidthdp.getClass();
        Object objMediaBrowserCompatMediaItem = onContentCardDismissed.MediaBrowserCompatMediaItem((List) this.RatingCompat);
        resetTransientState resettransientstate = this.RemoteActionCompatParcelizer;
        if (objMediaBrowserCompatMediaItem == null) {
            r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = androidx.room.Room.read(setgraphicmodalmaxwidthdp.getDescriptor(), resettransientstate.RemoteActionCompatParcelizer);
            if ((r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer() instanceof DefaultInAppMessageModalViewFactory) || r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer() == r8lambda7TbKsIS1F2Je6e1BPmbF7ukhpw.IconCompatParcelizer) {
                new prepareInAppMessagelambda0(resettransientstate, this.serializer, 1).read(setgraphicmodalmaxwidthdp2, obj);
                return;
            }
        }
        boolean z = setgraphicmodalmaxwidthdp2 instanceof AbstractPolymorphicSerializer;
        lambdaperformDismiss0 lambdaperformdismiss0 = resettransientstate.IconCompatParcelizer.read;
        if (z) {
            strWrite = lambdaperformdismiss0 != lambdaperformDismiss0.NONE ? LazyKt__LazyJVMKt.write(setgraphicmodalmaxwidthdp.getDescriptor(), resettransientstate) : null;
        } else {
            int i = prepareInAppMessageForDisplay.read[lambdaperformdismiss0.ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return;
                }
                RegexKt regexKtRemoteActionCompatParcelizer = setgraphicmodalmaxwidthdp.getDescriptor().RemoteActionCompatParcelizer();
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{regexKtRemoteActionCompatParcelizer, r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{regexKtRemoteActionCompatParcelizer, r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.write}, getCieXyz.write())).booleanValue()) {
                    }
                }
            }
        }
        if (z) {
            AbstractPolymorphicSerializer abstractPolymorphicSerializer = (AbstractPolymorphicSerializer) setgraphicmodalmaxwidthdp2;
            if (obj == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Value for serializer ", abstractPolymorphicSerializer.getDescriptor(), " should always be non-null. Please report issue to the kotlinx.serialization tracker.");
                return;
            }
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = TuplesKt.serializer(abstractPolymorphicSerializer, this, obj);
            if (strWrite != null) {
                LazyKt__LazyJVMKt.read(setgraphicmodalmaxwidthdp2, setgraphicmodalmaxwidthdpSerializer, strWrite);
                LazyKt__LazyJVMKt.read(setgraphicmodalmaxwidthdpSerializer.getDescriptor().RemoteActionCompatParcelizer());
            }
            setgraphicmodalmaxwidthdp2 = setgraphicmodalmaxwidthdpSerializer;
        }
        if (strWrite != null) {
            String strSerializer = setgraphicmodalmaxwidthdp2.getDescriptor().serializer();
            this.MediaDescriptionCompat = strWrite;
            this.MediaMetadataCompat = strSerializer;
        }
        setgraphicmodalmaxwidthdp2.serialize(this, obj);
    }

    @Override // o.DefaultInAppMessageSlideupViewFactory
    public final boolean read(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        return this.IconCompatParcelizer.MediaSessionCompatQueueItem;
    }

    @Override // o.DefaultInAppMessageViewWrapperFactory
    public final DefaultInAppMessageSlideupViewFactory serializer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        prepareInAppMessagelambda0 prepareinappmessagelambda0;
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM abstractMap$$ExternalSyntheticLambda0 = onContentCardDismissed.MediaBrowserCompatMediaItem((List) this.RatingCompat) == null ? this.serializer : new AbstractMap$$ExternalSyntheticLambda0(7, this);
        RegexKt regexKtRemoteActionCompatParcelizer = r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer();
        boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{regexKtRemoteActionCompatParcelizer, r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue();
        resetTransientState resettransientstate = this.RemoteActionCompatParcelizer;
        if (zBooleanValue || (regexKtRemoteActionCompatParcelizer instanceof createInAppMessageViewlambda0)) {
            prepareinappmessagelambda0 = new prepareInAppMessagelambda0(resettransientstate, abstractMap$$ExternalSyntheticLambda0, 2);
        } else {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{regexKtRemoteActionCompatParcelizer, r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.serializer}, getCieXyz.write())).booleanValue()) {
                r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda2 = androidx.room.Room.read(r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer(0), resettransientstate.RemoteActionCompatParcelizer);
                RegexKt regexKtRemoteActionCompatParcelizer2 = r8lambda92m0p9sit5uf70mvjf4rwmruda2.RemoteActionCompatParcelizer();
                if (!(regexKtRemoteActionCompatParcelizer2 instanceof DefaultInAppMessageModalViewFactory)) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{regexKtRemoteActionCompatParcelizer2, r8lambda7TbKsIS1F2Je6e1BPmbF7ukhpw.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                        throw coil3.util.IntPair.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda2);
                    }
                }
                abstractMap$$ExternalSyntheticLambda0.getClass();
                prepareInAppMessagelambda3 prepareinappmessagelambda3 = new prepareInAppMessagelambda3(resettransientstate, abstractMap$$ExternalSyntheticLambda0, 0);
                prepareinappmessagelambda3.MediaBrowserCompatMediaItem = true;
                prepareinappmessagelambda0 = prepareinappmessagelambda3;
            } else {
                prepareinappmessagelambda0 = new prepareInAppMessagelambda0(resettransientstate, abstractMap$$ExternalSyntheticLambda0, 0);
            }
        }
        String str = this.MediaDescriptionCompat;
        if (str != null) {
            if (prepareinappmessagelambda0 instanceof prepareInAppMessagelambda3) {
                prepareInAppMessagelambda3 prepareinappmessagelambda4 = (prepareInAppMessagelambda3) prepareinappmessagelambda0;
                prepareinappmessagelambda4.write("key", TouchAwareSwipeDismissTouchListener.IconCompatParcelizer(str));
                String strSerializer = this.MediaMetadataCompat;
                if (strSerializer == null) {
                    strSerializer = r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer();
                }
                prepareinappmessagelambda4.write("value", TouchAwareSwipeDismissTouchListener.IconCompatParcelizer(strSerializer));
            } else {
                String strSerializer2 = this.MediaMetadataCompat;
                if (strSerializer2 == null) {
                    strSerializer2 = r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer();
                }
                prepareinappmessagelambda0.write(str, TouchAwareSwipeDismissTouchListener.IconCompatParcelizer(strSerializer2));
            }
            this.MediaDescriptionCompat = null;
            this.MediaMetadataCompat = null;
        }
        return prepareinappmessagelambda0;
    }

    @Override // o.DefaultInAppMessageSlideupViewFactory
    public final void serializer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i, String str) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        str.getClass();
        write(RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, i), TouchAwareSwipeDismissTouchListener.IconCompatParcelizer(str));
    }

    @Override // o.DefaultInAppMessageViewWrapperFactory
    public final DefaultInAppMessageSlideupViewFactory write(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        return serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.DefaultInAppMessageSlideupViewFactory
    public final void write(int i, int i2, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        write(RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, i), TouchAwareSwipeDismissTouchListener.IconCompatParcelizer(Integer.valueOf(i2)));
    }

    @Override // o.DefaultInAppMessageSlideupViewFactory
    public final void write(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i, float f) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        write(f, RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, i));
    }

    @Override // o.DefaultInAppMessageViewWrapperFactory
    public final void RemoteActionCompatParcelizer(byte b) {
        String str = (String) RemoteActionCompatParcelizer();
        str.getClass();
        write(str, TouchAwareSwipeDismissTouchListener.IconCompatParcelizer(Byte.valueOf(b)));
    }

    @Override // o.DefaultInAppMessageViewWrapperFactory
    public final void RemoteActionCompatParcelizer(char c) {
        String str = (String) RemoteActionCompatParcelizer();
        str.getClass();
        write(str, TouchAwareSwipeDismissTouchListener.IconCompatParcelizer(String.valueOf(c)));
    }

    @Override // o.DefaultInAppMessageViewWrapperFactory
    public final void RemoteActionCompatParcelizer(double d) {
        IconCompatParcelizer(RemoteActionCompatParcelizer(), d);
    }

    @Override // o.DefaultInAppMessageViewWrapperFactory
    public final void RemoteActionCompatParcelizer(boolean z) {
        String str = (String) RemoteActionCompatParcelizer();
        str.getClass();
        write(str, TouchAwareSwipeDismissTouchListener.write(Boolean.valueOf(z)));
    }

    @Override // o.DefaultInAppMessageViewWrapperFactory
    public final void read(float f) {
        write(f, RemoteActionCompatParcelizer());
    }

    @Override // o.DefaultInAppMessageViewWrapperFactory
    public final void read(int i) {
        String str = (String) RemoteActionCompatParcelizer();
        str.getClass();
        write(str, TouchAwareSwipeDismissTouchListener.IconCompatParcelizer(Integer.valueOf(i)));
    }

    @Override // o.DefaultInAppMessageViewWrapperFactory
    public final void read(short s) {
        String str = (String) RemoteActionCompatParcelizer();
        str.getClass();
        write(str, TouchAwareSwipeDismissTouchListener.IconCompatParcelizer(Short.valueOf(s)));
    }

    @Override // o.DefaultInAppMessageViewWrapperFactory
    public final void serializer(long j) {
        String str = (String) RemoteActionCompatParcelizer();
        str.getClass();
        write(str, TouchAwareSwipeDismissTouchListener.IconCompatParcelizer(Long.valueOf(j)));
    }

    @Override // o.DefaultInAppMessageSlideupViewFactory
    public void read(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i, setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp, Object obj) {
        if (this.write != 0) {
            RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, i, setgraphicmodalmaxwidthdp, obj);
            return;
        }
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        setgraphicmodalmaxwidthdp.getClass();
        if (obj != null || this.IconCompatParcelizer.RatingCompat) {
            RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, i, setgraphicmodalmaxwidthdp, obj);
        }
    }

    public SwipeDismissTouchListenerVerticalDismissDirection write() {
        int i = this.write;
        if (i == 0) {
            return new r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k((LinkedHashMap) this.read);
        }
        if (i != 1) {
            return new requestDisallowParentIntercept((ArrayList) this.read);
        }
        SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection = (SwipeDismissTouchListenerVerticalDismissDirection) this.read;
        if (swipeDismissTouchListenerVerticalDismissDirection != null) {
            return swipeDismissTouchListenerVerticalDismissDirection;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
        return null;
    }

    public prepareInAppMessagelambda0(resetTransientState resettransientstate, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, char c) {
        this.RatingCompat = new ArrayList();
        this.RemoteActionCompatParcelizer = resettransientstate;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.IconCompatParcelizer = resettransientstate.IconCompatParcelizer;
    }
}
