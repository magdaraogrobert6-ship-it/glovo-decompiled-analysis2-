package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.TuplesKt;
import kotlin.text.RegexKt;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.json.internal.JsonNamesMapKt;

/* JADX INFO: loaded from: classes4.dex */
public final class prepareInAppMessageWithBitmapDownloadlambda3 extends androidx.sqlite.SQLite implements BackgroundInAppMessagePreparer {
    public final SwipeDismissTouchListener1 IconCompatParcelizer;
    public final prepareInAppMessageWithHtmllambda1 MediaBrowserCompatMediaItem;
    public final prepareInAppMessageWithZippedAssetHtml MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompatQueueItem;
    public final BackgroundInAppMessagePreparer[] RatingCompat;
    public final truncslo4al4 RemoteActionCompatParcelizer;
    public boolean serializer;
    public final resetTransientState write;

    @Override // o.DefaultInAppMessageViewWrapperFactory
    public final prepareInAppMessageWithZippedAssetHtml MediaSessionCompatQueueItem() {
        return this.MediaDescriptionCompat;
    }

    @Override // o.BackgroundInAppMessagePreparer
    public final resetTransientState read() {
        return this.write;
    }

    @Override // androidx.sqlite.SQLite, o.DefaultInAppMessageViewWrapperFactory
    public final void IconCompatParcelizer() {
        truncslo4al4 truncslo4al4Var = this.RemoteActionCompatParcelizer;
        truncslo4al4Var.getClass();
        ((CSSParseException) truncslo4al4Var.IconCompatParcelizer).read("null");
    }

    @Override // androidx.sqlite.SQLite, o.DefaultInAppMessageViewWrapperFactory
    public final void RemoteActionCompatParcelizer(double d) {
        boolean z = this.serializer;
        truncslo4al4 truncslo4al4Var = this.RemoteActionCompatParcelizer;
        if (z) {
            IconCompatParcelizer(String.valueOf(d));
        } else {
            ((CSSParseException) truncslo4al4Var.IconCompatParcelizer).read(String.valueOf(d));
        }
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw coil3.util.IntPair.write(((CSSParseException) truncslo4al4Var.IconCompatParcelizer).toString(), Double.valueOf(d));
        }
    }

    @Override // androidx.sqlite.SQLite, o.DefaultInAppMessageViewWrapperFactory
    public final void read(float f) {
        boolean z = this.serializer;
        truncslo4al4 truncslo4al4Var = this.RemoteActionCompatParcelizer;
        if (z) {
            IconCompatParcelizer(String.valueOf(f));
        } else {
            ((CSSParseException) truncslo4al4Var.IconCompatParcelizer).read(String.valueOf(f));
        }
        if (Math.abs(f) > Float.MAX_VALUE) {
            throw coil3.util.IntPair.write(((CSSParseException) truncslo4al4Var.IconCompatParcelizer).toString(), Float.valueOf(f));
        }
    }

    public prepareInAppMessageWithBitmapDownloadlambda3(truncslo4al4 truncslo4al4Var, resetTransientState resettransientstate, prepareInAppMessageWithHtmllambda1 prepareinappmessagewithhtmllambda1, BackgroundInAppMessagePreparer[] backgroundInAppMessagePreparerArr) {
        truncslo4al4Var.getClass();
        this.RemoteActionCompatParcelizer = truncslo4al4Var;
        this.write = resettransientstate;
        this.MediaBrowserCompatMediaItem = prepareinappmessagewithhtmllambda1;
        this.RatingCompat = backgroundInAppMessagePreparerArr;
        this.MediaDescriptionCompat = resettransientstate.RemoteActionCompatParcelizer;
        this.IconCompatParcelizer = resettransientstate.IconCompatParcelizer;
        int iOrdinal = prepareinappmessagewithhtmllambda1.ordinal();
        if (backgroundInAppMessagePreparerArr != null) {
            BackgroundInAppMessagePreparer backgroundInAppMessagePreparer = backgroundInAppMessagePreparerArr[iOrdinal];
            if (backgroundInAppMessagePreparer == null && backgroundInAppMessagePreparer == this) {
                return;
            }
            backgroundInAppMessagePreparerArr[iOrdinal] = this;
        }
    }

    @Override // androidx.sqlite.SQLite, o.DefaultInAppMessageViewWrapperFactory
    public final void IconCompatParcelizer(String str) {
        str.getClass();
        this.RemoteActionCompatParcelizer.write(str);
    }

    @Override // o.BackgroundInAppMessagePreparer
    public final void IconCompatParcelizer(SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection) {
        swipeDismissTouchListenerVerticalDismissDirection.getClass();
        if (this.MediaSessionCompatQueueItem == null || (swipeDismissTouchListenerVerticalDismissDirection instanceof r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k)) {
            read(r8lambda2svec8wazNIYAk5Hq146H0SPIb4.IconCompatParcelizer, swipeDismissTouchListenerVerticalDismissDirection);
        } else {
            LazyKt__LazyJVMKt.read(this.MediaMetadataCompat, swipeDismissTouchListenerVerticalDismissDirection);
            throw null;
        }
    }

    @Override // androidx.sqlite.SQLite, o.DefaultInAppMessageSlideupViewFactory
    public final void IconCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        prepareInAppMessageWithHtmllambda1 prepareinappmessagewithhtmllambda1 = this.MediaBrowserCompatMediaItem;
        if (prepareinappmessagewithhtmllambda1.end != 0) {
            truncslo4al4 truncslo4al4Var = this.RemoteActionCompatParcelizer;
            truncslo4al4Var.IconCompatParcelizer();
            truncslo4al4Var.write();
            truncslo4al4Var.IconCompatParcelizer(prepareinappmessagewithhtmllambda1.end);
        }
    }

    @Override // androidx.sqlite.SQLite, o.DefaultInAppMessageViewWrapperFactory
    public final DefaultInAppMessageViewWrapperFactory RemoteActionCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        boolean zIconCompatParcelizer = prepareInAppMessageWithBitmapDownloadlambda1.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        prepareInAppMessageWithHtmllambda1 prepareinappmessagewithhtmllambda1 = this.MediaBrowserCompatMediaItem;
        resetTransientState resettransientstate = this.write;
        truncslo4al4 displaypreparedinappmessage = this.RemoteActionCompatParcelizer;
        if (zIconCompatParcelizer) {
            if (!(displaypreparedinappmessage instanceof handleLocalImage)) {
                displaypreparedinappmessage = new handleLocalImage((CSSParseException) displaypreparedinappmessage.IconCompatParcelizer, this.serializer);
            }
            return new prepareInAppMessageWithBitmapDownloadlambda3(displaypreparedinappmessage, resettransientstate, prepareinappmessagewithhtmllambda1, null);
        }
        if (prepareInAppMessageWithBitmapDownloadlambda1.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (!(displaypreparedinappmessage instanceof displayPreparedInAppMessage)) {
                displaypreparedinappmessage = new displayPreparedInAppMessage((CSSParseException) displaypreparedinappmessage.IconCompatParcelizer, this.serializer);
            }
            return new prepareInAppMessageWithBitmapDownloadlambda3(displaypreparedinappmessage, resettransientstate, prepareinappmessagewithhtmllambda1, null);
        }
        if (this.MediaSessionCompatQueueItem != null) {
            this.MediaMetadataCompat = r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer();
        }
        return this;
    }

    @Override // androidx.sqlite.SQLite
    public final void RemoteActionCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        int i2 = prepareInAppMessageWithBitmapDownloadlambda4.IconCompatParcelizer[this.MediaBrowserCompatMediaItem.ordinal()];
        truncslo4al4 truncslo4al4Var = this.RemoteActionCompatParcelizer;
        boolean z = true;
        if (i2 == 1) {
            if (!truncslo4al4Var.read) {
                truncslo4al4Var.IconCompatParcelizer(',');
            }
            truncslo4al4Var.RemoteActionCompatParcelizer();
            return;
        }
        if (i2 == 2) {
            if (truncslo4al4Var.read) {
                this.serializer = true;
                truncslo4al4Var.RemoteActionCompatParcelizer();
                return;
            }
            if (i % 2 == 0) {
                truncslo4al4Var.IconCompatParcelizer(',');
                truncslo4al4Var.RemoteActionCompatParcelizer();
            } else {
                truncslo4al4Var.IconCompatParcelizer(':');
                truncslo4al4Var.read();
                z = false;
            }
            this.serializer = z;
            return;
        }
        if (i2 != 3) {
            if (!truncslo4al4Var.read) {
                truncslo4al4Var.IconCompatParcelizer(',');
            }
            truncslo4al4Var.RemoteActionCompatParcelizer();
            JsonNamesMapKt.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, this.write);
            IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda.IconCompatParcelizer(i));
            truncslo4al4Var.IconCompatParcelizer(':');
            truncslo4al4Var.read();
            return;
        }
        if (i == 0) {
            this.serializer = true;
        }
        if (i == 1) {
            truncslo4al4Var.IconCompatParcelizer(',');
            truncslo4al4Var.read();
            this.serializer = false;
        }
    }

    @Override // androidx.sqlite.SQLite, o.DefaultInAppMessageViewWrapperFactory
    public final void read(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda.IconCompatParcelizer(i));
    }

    @Override // androidx.sqlite.SQLite, o.DefaultInAppMessageSlideupViewFactory
    public final void read(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i, setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp, Object obj) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        setgraphicmodalmaxwidthdp.getClass();
        if (obj != null || this.IconCompatParcelizer.RatingCompat) {
            super.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, i, setgraphicmodalmaxwidthdp, obj);
        }
    }

    @Override // androidx.sqlite.SQLite, o.DefaultInAppMessageViewWrapperFactory
    public final void read(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp, Object obj) {
        String strWrite;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2 = setgraphicmodalmaxwidthdp;
        setgraphicmodalmaxwidthdp.getClass();
        resetTransientState resettransientstate = this.write;
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
            this.MediaSessionCompatQueueItem = strWrite;
            this.MediaMetadataCompat = strSerializer;
        }
        setgraphicmodalmaxwidthdp2.serialize(this, obj);
    }

    @Override // androidx.sqlite.SQLite, o.DefaultInAppMessageSlideupViewFactory
    public final boolean read(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        return this.IconCompatParcelizer.MediaSessionCompatQueueItem;
    }

    @Override // androidx.sqlite.SQLite, o.DefaultInAppMessageViewWrapperFactory
    public final DefaultInAppMessageSlideupViewFactory serializer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        BackgroundInAppMessagePreparer backgroundInAppMessagePreparer;
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        resetTransientState resettransientstate = this.write;
        prepareInAppMessageWithHtmllambda1 prepareinappmessagewithhtmllambda1RemoteActionCompatParcelizer = androidx.room.Room.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, resettransientstate);
        char c = prepareinappmessagewithhtmllambda1RemoteActionCompatParcelizer.begin;
        truncslo4al4 truncslo4al4Var = this.RemoteActionCompatParcelizer;
        if (c != 0) {
            truncslo4al4Var.IconCompatParcelizer(c);
            truncslo4al4Var.serializer();
        }
        String str = this.MediaSessionCompatQueueItem;
        if (str != null) {
            String strSerializer = this.MediaMetadataCompat;
            if (strSerializer == null) {
                strSerializer = r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer();
            }
            truncslo4al4Var.RemoteActionCompatParcelizer();
            truncslo4al4Var.write(str);
            truncslo4al4Var.IconCompatParcelizer(':');
            truncslo4al4Var.read();
            IconCompatParcelizer(strSerializer);
            this.MediaSessionCompatQueueItem = null;
            this.MediaMetadataCompat = null;
        }
        if (this.MediaBrowserCompatMediaItem == prepareinappmessagewithhtmllambda1RemoteActionCompatParcelizer) {
            return this;
        }
        BackgroundInAppMessagePreparer[] backgroundInAppMessagePreparerArr = this.RatingCompat;
        return (backgroundInAppMessagePreparerArr == null || (backgroundInAppMessagePreparer = backgroundInAppMessagePreparerArr[prepareinappmessagewithhtmllambda1RemoteActionCompatParcelizer.ordinal()]) == null) ? new prepareInAppMessageWithBitmapDownloadlambda3(truncslo4al4Var, resettransientstate, prepareinappmessagewithhtmllambda1RemoteActionCompatParcelizer, backgroundInAppMessagePreparerArr) : backgroundInAppMessagePreparer;
    }

    @Override // androidx.sqlite.SQLite, o.DefaultInAppMessageViewWrapperFactory
    public final void RemoteActionCompatParcelizer(char c) {
        IconCompatParcelizer(String.valueOf(c));
    }

    @Override // androidx.sqlite.SQLite, o.DefaultInAppMessageViewWrapperFactory
    public final void RemoteActionCompatParcelizer(byte b) {
        if (this.serializer) {
            IconCompatParcelizer(String.valueOf((int) b));
        } else {
            this.RemoteActionCompatParcelizer.read(b);
        }
    }

    @Override // androidx.sqlite.SQLite, o.DefaultInAppMessageViewWrapperFactory
    public final void RemoteActionCompatParcelizer(boolean z) {
        if (this.serializer) {
            IconCompatParcelizer(String.valueOf(z));
        } else {
            ((CSSParseException) this.RemoteActionCompatParcelizer.IconCompatParcelizer).read(String.valueOf(z));
        }
    }

    @Override // androidx.sqlite.SQLite, o.DefaultInAppMessageViewWrapperFactory
    public final void read(int i) {
        if (this.serializer) {
            IconCompatParcelizer(String.valueOf(i));
        } else {
            this.RemoteActionCompatParcelizer.write(i);
        }
    }

    @Override // androidx.sqlite.SQLite, o.DefaultInAppMessageViewWrapperFactory
    public final void read(short s) {
        if (this.serializer) {
            IconCompatParcelizer(String.valueOf((int) s));
        } else {
            this.RemoteActionCompatParcelizer.serializer(s);
        }
    }

    @Override // androidx.sqlite.SQLite, o.DefaultInAppMessageViewWrapperFactory
    public final void serializer(long j) {
        if (this.serializer) {
            IconCompatParcelizer(String.valueOf(j));
        } else {
            this.RemoteActionCompatParcelizer.serializer(j);
        }
    }
}
