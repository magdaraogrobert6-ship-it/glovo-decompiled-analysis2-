package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.TuplesKt;
import kotlin.text.RegexKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.json.internal.JsonNamesMapKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambdaquOZlpDNY0TUGg1V6w2FHn0_r6Y implements setTouchListener {
    public boolean IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final ArrayList read = new ArrayList();
    public final SwipeDismissTouchListener1 serializer;
    public final resetTransientState write;

    public abstract SwipeDismissTouchListenerVerticalDismissDirection RemoteActionCompatParcelizer();

    public abstract SwipeDismissTouchListenerVerticalDismissDirection RemoteActionCompatParcelizer(String str);

    @Override // o.setTouchListener
    public final SwipeDismissTouchListenerVerticalDismissDirection read() {
        return write();
    }

    @Override // o.setTouchListener
    public final resetTransientState serializer() {
        return this.write;
    }

    public void write(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
    }

    public final byte IconCompatParcelizer(Object obj) {
        String str = (String) obj;
        str.getClass();
        SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str);
        if (!(swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer instanceof r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0)) {
            throw coil3.util.IntPair.IconCompatParcelizer(swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer.toString(), -1, "Expected " + displayInAppMessagelambda1.serializer(r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0.class).IconCompatParcelizer() + ", but had " + displayInAppMessagelambda1.serializer(swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer.getClass()).IconCompatParcelizer() + " as the serialized body of byte at element: " + read(str));
        }
        r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0 r8lambdagbekcaskecamm7h9dyqnzofon0 = (r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0) swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer;
        try {
            long jSerializer = TouchAwareSwipeDismissTouchListener.serializer(r8lambdagbekcaskecamm7h9dyqnzofon0);
            Byte bValueOf = (-128 > jSerializer || jSerializer > 127) ? null : Byte.valueOf((byte) jSerializer);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            write(r8lambdagbekcaskecamm7h9dyqnzofon0, "byte", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            write(r8lambdagbekcaskecamm7h9dyqnzofon0, "byte", str);
            throw null;
        }
    }

    public final Object IconCompatParcelizer() {
        ArrayList arrayList = this.read;
        Object objRemove = arrayList.remove(androidx.sqlite.SQLite.write((List) arrayList));
        this.IconCompatParcelizer = true;
        return objRemove;
    }

    public final String MediaBrowserCompatMediaItem(Object obj) {
        String str = (String) obj;
        str.getClass();
        SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str);
        if (!(swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer instanceof r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0)) {
            throw coil3.util.IntPair.IconCompatParcelizer(swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer.toString(), -1, "Expected " + displayInAppMessagelambda1.serializer(r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0.class).IconCompatParcelizer() + ", but had " + displayInAppMessagelambda1.serializer(swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer.getClass()).IconCompatParcelizer() + " as the serialized body of string at element: " + read(str));
        }
        r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0 r8lambdagbekcaskecamm7h9dyqnzofon0 = (r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0) swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer;
        if (!(r8lambdagbekcaskecamm7h9dyqnzofon0 instanceof r8lambdaYXKvph92AFXPW6K5kDS4_5qza1U)) {
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Expected string value for a non-null key '", str, "', got null literal instead at element: ");
            sbM.append(read(str));
            throw coil3.util.IntPair.IconCompatParcelizer(write().toString(), -1, sbM.toString());
        }
        r8lambdaYXKvph92AFXPW6K5kDS4_5qza1U r8lambdayxkvph92afxpw6k5kds4_5qza1u = (r8lambdaYXKvph92AFXPW6K5kDS4_5qza1U) r8lambdagbekcaskecamm7h9dyqnzofon0;
        if (r8lambdayxkvph92afxpw6k5kds4_5qza1u.serializer || this.write.IconCompatParcelizer.MediaMetadataCompat) {
            return r8lambdayxkvph92afxpw6k5kds4_5qza1u.read;
        }
        StringBuilder sbM2 = c8$$ExternalSyntheticOutline0.m("String literal for key '", str, "' should be quoted at element: ");
        sbM2.append(read(str));
        sbM2.append(".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
        throw coil3.util.IntPair.IconCompatParcelizer(write().toString(), -1, sbM2.toString());
    }

    public final short MediaMetadataCompat(Object obj) {
        String str = (String) obj;
        str.getClass();
        SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str);
        if (!(swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer instanceof r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0)) {
            throw coil3.util.IntPair.IconCompatParcelizer(swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer.toString(), -1, "Expected " + displayInAppMessagelambda1.serializer(r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0.class).IconCompatParcelizer() + ", but had " + displayInAppMessagelambda1.serializer(swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer.getClass()).IconCompatParcelizer() + " as the serialized body of short at element: " + read(str));
        }
        r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0 r8lambdagbekcaskecamm7h9dyqnzofon0 = (r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0) swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer;
        try {
            long jSerializer = TouchAwareSwipeDismissTouchListener.serializer(r8lambdagbekcaskecamm7h9dyqnzofon0);
            Short shValueOf = (-32768 > jSerializer || jSerializer > 32767) ? null : Short.valueOf((short) jSerializer);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            write(r8lambdagbekcaskecamm7h9dyqnzofon0, "short", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            write(r8lambdagbekcaskecamm7h9dyqnzofon0, "short", str);
            throw null;
        }
    }

    public final long MediaSessionCompatQueueItem(Object obj) {
        String str = (String) obj;
        str.getClass();
        SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str);
        if (swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer instanceof r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0) {
            r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0 r8lambdagbekcaskecamm7h9dyqnzofon0 = (r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0) swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer;
            try {
                return TouchAwareSwipeDismissTouchListener.serializer(r8lambdagbekcaskecamm7h9dyqnzofon0);
            } catch (IllegalArgumentException unused) {
                write(r8lambdagbekcaskecamm7h9dyqnzofon0, com.adjust.sdk.Constants.LONG, str);
                throw null;
            }
        }
        throw coil3.util.IntPair.IconCompatParcelizer(swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer.toString(), -1, "Expected " + displayInAppMessagelambda1.serializer(r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0.class).IconCompatParcelizer() + ", but had " + displayInAppMessagelambda1.serializer(swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer.getClass()).IconCompatParcelizer() + " as the serialized body of long at element: " + read(str));
    }

    @Override // o.DefaultInAppMessageModalViewFactoryCompanion, o.createInAppMessageViewlambda1
    public final prepareInAppMessageWithZippedAssetHtml MediaSessionCompatQueueItem() {
        return this.write.RemoteActionCompatParcelizer;
    }

    public final int RatingCompat(Object obj) {
        String str = (String) obj;
        str.getClass();
        SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str);
        if (!(swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer instanceof r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0)) {
            throw coil3.util.IntPair.IconCompatParcelizer(swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer.toString(), -1, "Expected " + displayInAppMessagelambda1.serializer(r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0.class).IconCompatParcelizer() + ", but had " + displayInAppMessagelambda1.serializer(swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer.getClass()).IconCompatParcelizer() + " as the serialized body of int at element: " + read(str));
        }
        r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0 r8lambdagbekcaskecamm7h9dyqnzofon0 = (r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0) swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer;
        try {
            long jSerializer = TouchAwareSwipeDismissTouchListener.serializer(r8lambdagbekcaskecamm7h9dyqnzofon0);
            Integer numValueOf = (-2147483648L > jSerializer || jSerializer > 2147483647L) ? null : Integer.valueOf((int) jSerializer);
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
            write(r8lambdagbekcaskecamm7h9dyqnzofon0, "int", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            write(r8lambdagbekcaskecamm7h9dyqnzofon0, "int", str);
            throw null;
        }
    }

    public final char RemoteActionCompatParcelizer(Object obj) {
        String str = (String) obj;
        str.getClass();
        SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str);
        if (!(swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer instanceof r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0)) {
            throw coil3.util.IntPair.IconCompatParcelizer(swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer.toString(), -1, "Expected " + displayInAppMessagelambda1.serializer(r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0.class).IconCompatParcelizer() + ", but had " + displayInAppMessagelambda1.serializer(swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer.getClass()).IconCompatParcelizer() + " as the serialized body of char at element: " + read(str));
        }
        r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0 r8lambdagbekcaskecamm7h9dyqnzofon0 = (r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0) swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer;
        try {
            String strIconCompatParcelizer = r8lambdagbekcaskecamm7h9dyqnzofon0.IconCompatParcelizer();
            strIconCompatParcelizer.getClass();
            int length = strIconCompatParcelizer.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return strIconCompatParcelizer.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            write(r8lambdagbekcaskecamm7h9dyqnzofon0, "char", str);
            throw null;
        }
    }

    public final double read(Object obj) {
        String str = (String) obj;
        str.getClass();
        SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str);
        if (!(swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer instanceof r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0)) {
            throw coil3.util.IntPair.IconCompatParcelizer(swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer.toString(), -1, "Expected " + displayInAppMessagelambda1.serializer(r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0.class).IconCompatParcelizer() + ", but had " + displayInAppMessagelambda1.serializer(swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer.getClass()).IconCompatParcelizer() + " as the serialized body of double at element: " + read(str));
        }
        r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0 r8lambdagbekcaskecamm7h9dyqnzofon0 = (r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0) swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer;
        try {
            performClickActionlambda1 performclickactionlambda1 = TouchAwareSwipeDismissTouchListener.RemoteActionCompatParcelizer;
            double d = Double.parseDouble(r8lambdagbekcaskecamm7h9dyqnzofon0.IconCompatParcelizer());
            SwipeDismissTouchListener1 swipeDismissTouchListener1 = this.write.IconCompatParcelizer;
            if (Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            String string = write().toString();
            string.getClass();
            throw coil3.util.IntPair.RemoteActionCompatParcelizer(-1, coil3.util.IntPair.read(Double.valueOf(d), str, string));
        } catch (IllegalArgumentException unused) {
            write(r8lambdagbekcaskecamm7h9dyqnzofon0, "double", str);
            throw null;
        }
    }

    public final float serializer(Object obj) {
        String str = (String) obj;
        str.getClass();
        SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str);
        if (!(swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer instanceof r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0)) {
            throw coil3.util.IntPair.IconCompatParcelizer(swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer.toString(), -1, "Expected " + displayInAppMessagelambda1.serializer(r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0.class).IconCompatParcelizer() + ", but had " + displayInAppMessagelambda1.serializer(swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer.getClass()).IconCompatParcelizer() + " as the serialized body of float at element: " + read(str));
        }
        r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0 r8lambdagbekcaskecamm7h9dyqnzofon0 = (r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0) swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer;
        try {
            performClickActionlambda1 performclickactionlambda1 = TouchAwareSwipeDismissTouchListener.RemoteActionCompatParcelizer;
            float f = Float.parseFloat(r8lambdagbekcaskecamm7h9dyqnzofon0.IconCompatParcelizer());
            SwipeDismissTouchListener1 swipeDismissTouchListener1 = this.write.IconCompatParcelizer;
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            String string = write().toString();
            string.getClass();
            throw coil3.util.IntPair.RemoteActionCompatParcelizer(-1, coil3.util.IntPair.read(Float.valueOf(f), str, string));
        } catch (IllegalArgumentException unused) {
            write(r8lambdagbekcaskecamm7h9dyqnzofon0, "float", str);
            throw null;
        }
    }

    public final DefaultInAppMessageModalViewFactoryCompanion write(Object obj, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        String str = (String) obj;
        str.getClass();
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        if (!prepareInAppMessageWithBitmapDownloadlambda1.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            this.read.add(str);
            return this;
        }
        SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str);
        String strSerializer = r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer();
        if (swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer instanceof r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0) {
            String strIconCompatParcelizer = ((r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0) swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer).IconCompatParcelizer();
            resetTransientState resettransientstate = this.write;
            resettransientstate.getClass();
            strIconCompatParcelizer.getClass();
            return new getViewBoundsByType(new applyDisplayCutoutMarginsToCloseButtonlambda0(strIconCompatParcelizer), resettransientstate);
        }
        throw coil3.util.IntPair.IconCompatParcelizer(swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer.toString(), -1, "Expected " + displayInAppMessagelambda1.serializer(r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0.class).IconCompatParcelizer() + ", but had " + displayInAppMessagelambda1.serializer(swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer.getClass()).IconCompatParcelizer() + " as the serialized body of " + strSerializer + " at element: " + read(str));
    }

    public final SwipeDismissTouchListenerVerticalDismissDirection write() {
        SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer;
        String str = (String) onContentCardDismissed.MediaBrowserCompatMediaItem((List) this.read);
        return (str == null || (swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str)) == null) ? RemoteActionCompatParcelizer() : swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer;
    }

    public final boolean write(Object obj) {
        String str = (String) obj;
        str.getClass();
        SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str);
        if (swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer instanceof r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0) {
            r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0 r8lambdagbekcaskecamm7h9dyqnzofon0 = (r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0) swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer;
            try {
                Boolean boolRemoteActionCompatParcelizer = TouchAwareSwipeDismissTouchListener.RemoteActionCompatParcelizer(r8lambdagbekcaskecamm7h9dyqnzofon0);
                if (boolRemoteActionCompatParcelizer != null) {
                    return boolRemoteActionCompatParcelizer.booleanValue();
                }
                write(r8lambdagbekcaskecamm7h9dyqnzofon0, "boolean", str);
                throw null;
            } catch (IllegalArgumentException unused) {
                write(r8lambdagbekcaskecamm7h9dyqnzofon0, "boolean", str);
                throw null;
            }
        }
        throw coil3.util.IntPair.IconCompatParcelizer(swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer.toString(), -1, "Expected " + displayInAppMessagelambda1.serializer(r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0.class).IconCompatParcelizer() + ", but had " + displayInAppMessagelambda1.serializer(swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer.getClass()).IconCompatParcelizer() + " as the serialized body of boolean at element: " + read(str));
    }

    @Override // o.DefaultInAppMessageModalViewFactoryCompanion
    public final int IconCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        String str = (String) IconCompatParcelizer();
        str.getClass();
        SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str);
        String strSerializer = r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer();
        if (swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer instanceof r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0) {
            return JsonNamesMapKt.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, this.write, ((r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0) swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer).IconCompatParcelizer(), "");
        }
        throw coil3.util.IntPair.IconCompatParcelizer(swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer.toString(), -1, "Expected " + displayInAppMessagelambda1.serializer(r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0.class).IconCompatParcelizer() + ", but had " + displayInAppMessagelambda1.serializer(swipeDismissTouchListenerVerticalDismissDirectionRemoteActionCompatParcelizer.getClass()).IconCompatParcelizer() + " as the serialized body of " + strSerializer + " at element: " + read(str));
    }

    @Override // o.createInAppMessageViewlambda1
    public final int IconCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        return RatingCompat(MediaBrowserCompatMediaItem(r8lambda92m0p9sit5uf70mvjf4rwmruda, i));
    }

    @Override // o.createInAppMessageViewlambda1
    public final Object IconCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i, setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp, Object obj) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        setgraphicmodalmaxwidthdp.getClass();
        this.read.add(MediaBrowserCompatMediaItem(r8lambda92m0p9sit5uf70mvjf4rwmruda, i));
        setgraphicmodalmaxwidthdp.getClass();
        Object objWrite = write(setgraphicmodalmaxwidthdp);
        if (!this.IconCompatParcelizer) {
            IconCompatParcelizer();
        }
        this.IconCompatParcelizer = false;
        return objWrite;
    }

    public final String MediaBrowserCompatMediaItem(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        String strMediaDescriptionCompat = MediaDescriptionCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i);
        strMediaDescriptionCompat.getClass();
        return strMediaDescriptionCompat;
    }

    public String MediaDescriptionCompat(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        return r8lambda92m0p9sit5uf70mvjf4rwmruda.IconCompatParcelizer(i);
    }

    @Override // o.createInAppMessageViewlambda1
    public final String MediaMetadataCompat(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        return MediaBrowserCompatMediaItem(MediaBrowserCompatMediaItem(r8lambda92m0p9sit5uf70mvjf4rwmruda, i));
    }

    @Override // o.createInAppMessageViewlambda1
    public final double RemoteActionCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        return read((Object) MediaBrowserCompatMediaItem(r8lambda92m0p9sit5uf70mvjf4rwmruda, i));
    }

    @Override // o.createInAppMessageViewlambda1
    public final DefaultInAppMessageModalViewFactoryCompanion RemoteActionCompatParcelizer(onCloseActionlambda0 oncloseactionlambda0, int i) {
        oncloseactionlambda0.getClass();
        return write(MediaBrowserCompatMediaItem(oncloseactionlambda0, i), oncloseactionlambda0.RemoteActionCompatParcelizer(i));
    }

    @Override // o.DefaultInAppMessageModalViewFactoryCompanion
    public final DefaultInAppMessageModalViewFactoryCompanion RemoteActionCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        if (onContentCardDismissed.MediaBrowserCompatMediaItem((List) this.read) != null) {
            return write(IconCompatParcelizer(), r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        return new handleLocalImagelambda0(this.write, RemoteActionCompatParcelizer(), this.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.createInAppMessageViewlambda1
    public final float read(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        return serializer(MediaBrowserCompatMediaItem(r8lambda92m0p9sit5uf70mvjf4rwmruda, i));
    }

    @Override // o.createInAppMessageViewlambda1
    public final short read(onCloseActionlambda0 oncloseactionlambda0, int i) {
        oncloseactionlambda0.getClass();
        return MediaMetadataCompat(MediaBrowserCompatMediaItem(oncloseactionlambda0, i));
    }

    @Override // o.createInAppMessageViewlambda1
    public final char serializer(onCloseActionlambda0 oncloseactionlambda0, int i) {
        oncloseactionlambda0.getClass();
        return RemoteActionCompatParcelizer((Object) MediaBrowserCompatMediaItem(oncloseactionlambda0, i));
    }

    @Override // o.createInAppMessageViewlambda1
    public final long serializer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        return MediaSessionCompatQueueItem(MediaBrowserCompatMediaItem(r8lambda92m0p9sit5uf70mvjf4rwmruda, i));
    }

    @Override // o.createInAppMessageViewlambda1
    public final Object serializer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i, setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp, Object obj) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        setgraphicmodalmaxwidthdp.getClass();
        this.read.add(MediaBrowserCompatMediaItem(r8lambda92m0p9sit5uf70mvjf4rwmruda, i));
        Object objWrite = (setgraphicmodalmaxwidthdp.getDescriptor().MediaBrowserCompatMediaItem() || r8lambda7IJBVrN0sHyidCAZufWEJFc7yY()) ? write(setgraphicmodalmaxwidthdp) : null;
        if (!this.IconCompatParcelizer) {
            IconCompatParcelizer();
        }
        this.IconCompatParcelizer = false;
        return objWrite;
    }

    @Override // o.DefaultInAppMessageModalViewFactoryCompanion
    public createInAppMessageViewlambda1 serializer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirectionWrite = write();
        RegexKt regexKtRemoteActionCompatParcelizer = r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer();
        boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{regexKtRemoteActionCompatParcelizer, r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue();
        resetTransientState resettransientstate = this.write;
        if (zBooleanValue || (regexKtRemoteActionCompatParcelizer instanceof createInAppMessageViewlambda0)) {
            String strSerializer = r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer();
            if (swipeDismissTouchListenerVerticalDismissDirectionWrite instanceof requestDisallowParentIntercept) {
                return new prepareInAppMessage(resettransientstate, (requestDisallowParentIntercept) swipeDismissTouchListenerVerticalDismissDirectionWrite);
            }
            throw coil3.util.IntPair.IconCompatParcelizer(swipeDismissTouchListenerVerticalDismissDirectionWrite.toString(), -1, "Expected " + displayInAppMessagelambda1.serializer(requestDisallowParentIntercept.class).IconCompatParcelizer() + ", but had " + displayInAppMessagelambda1.serializer(swipeDismissTouchListenerVerticalDismissDirectionWrite.getClass()).IconCompatParcelizer() + " as the serialized body of " + strSerializer + " at element: " + RatingCompat());
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{regexKtRemoteActionCompatParcelizer, r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.serializer}, getCieXyz.write())).booleanValue()) {
            String strSerializer2 = r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer();
            if (swipeDismissTouchListenerVerticalDismissDirectionWrite instanceof r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k) {
                return new prepareInAppMessagelambda1(resettransientstate, (r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k) swipeDismissTouchListenerVerticalDismissDirectionWrite, this.RemoteActionCompatParcelizer, 8);
            }
            throw coil3.util.IntPair.IconCompatParcelizer(swipeDismissTouchListenerVerticalDismissDirectionWrite.toString(), -1, "Expected " + displayInAppMessagelambda1.serializer(r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k.class).IconCompatParcelizer() + ", but had " + displayInAppMessagelambda1.serializer(swipeDismissTouchListenerVerticalDismissDirectionWrite.getClass()).IconCompatParcelizer() + " as the serialized body of " + strSerializer2 + " at element: " + RatingCompat());
        }
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda2 = androidx.room.Room.read(r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer(0), resettransientstate.RemoteActionCompatParcelizer);
        RegexKt regexKtRemoteActionCompatParcelizer2 = r8lambda92m0p9sit5uf70mvjf4rwmruda2.RemoteActionCompatParcelizer();
        if (!(regexKtRemoteActionCompatParcelizer2 instanceof DefaultInAppMessageModalViewFactory)) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{regexKtRemoteActionCompatParcelizer2, r8lambda7TbKsIS1F2Je6e1BPmbF7ukhpw.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                throw coil3.util.IntPair.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda2);
            }
        }
        String strSerializer3 = r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer();
        if (swipeDismissTouchListenerVerticalDismissDirectionWrite instanceof r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k) {
            return new prepareInAppMessageWithBitmapDownloadlambda0(resettransientstate, (r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k) swipeDismissTouchListenerVerticalDismissDirectionWrite);
        }
        throw coil3.util.IntPair.IconCompatParcelizer(swipeDismissTouchListenerVerticalDismissDirectionWrite.toString(), -1, "Expected " + displayInAppMessagelambda1.serializer(r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k.class).IconCompatParcelizer() + ", but had " + displayInAppMessagelambda1.serializer(swipeDismissTouchListenerVerticalDismissDirectionWrite.getClass()).IconCompatParcelizer() + " as the serialized body of " + strSerializer3 + " at element: " + RatingCompat());
    }

    @Override // o.createInAppMessageViewlambda1
    public final byte write(onCloseActionlambda0 oncloseactionlambda0, int i) {
        oncloseactionlambda0.getClass();
        return IconCompatParcelizer(MediaBrowserCompatMediaItem(oncloseactionlambda0, i));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003f  */
    @Override // o.DefaultInAppMessageModalViewFactoryCompanion
    public final Object write(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp) {
        String strIconCompatParcelizer;
        setgraphicmodalmaxwidthdp.getClass();
        if (!(setgraphicmodalmaxwidthdp instanceof AbstractPolymorphicSerializer)) {
            return setgraphicmodalmaxwidthdp.deserialize(this);
        }
        resetTransientState resettransientstate = this.write;
        SwipeDismissTouchListener1 swipeDismissTouchListener1 = resettransientstate.IconCompatParcelizer;
        AbstractPolymorphicSerializer abstractPolymorphicSerializer = (AbstractPolymorphicSerializer) setgraphicmodalmaxwidthdp;
        String strWrite = LazyKt__LazyJVMKt.write(abstractPolymorphicSerializer.getDescriptor(), resettransientstate);
        SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirectionWrite = write();
        String strSerializer = abstractPolymorphicSerializer.getDescriptor().serializer();
        if (!(swipeDismissTouchListenerVerticalDismissDirectionWrite instanceof r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k)) {
            throw coil3.util.IntPair.IconCompatParcelizer(swipeDismissTouchListenerVerticalDismissDirectionWrite.toString(), -1, "Expected " + displayInAppMessagelambda1.serializer(r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k.class).IconCompatParcelizer() + ", but had " + displayInAppMessagelambda1.serializer(swipeDismissTouchListenerVerticalDismissDirectionWrite.getClass()).IconCompatParcelizer() + " as the serialized body of " + strSerializer + " at element: " + RatingCompat());
        }
        r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k r8lambdaerwhggzq_gqgn8cultnvrcshm8k = (r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k) swipeDismissTouchListenerVerticalDismissDirectionWrite;
        SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection = (SwipeDismissTouchListenerVerticalDismissDirection) r8lambdaerwhggzq_gqgn8cultnvrcshm8k.get(strWrite);
        if (swipeDismissTouchListenerVerticalDismissDirection != null) {
            r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0 r8lambdagbekcaskecamm7h9dyqnzofon0 = TouchAwareSwipeDismissTouchListener.read(swipeDismissTouchListenerVerticalDismissDirection);
            if (r8lambdagbekcaskecamm7h9dyqnzofon0 instanceof r8lambdaOVm5S_u8QUSoMXvJUOeZHUBFeHc) {
                strIconCompatParcelizer = null;
            } else {
                strIconCompatParcelizer = r8lambdagbekcaskecamm7h9dyqnzofon0.IconCompatParcelizer();
            }
        } else {
            strIconCompatParcelizer = null;
        }
        try {
            return setNativeShader.read(resettransientstate, strWrite, r8lambdaerwhggzq_gqgn8cultnvrcshm8k, TuplesKt.IconCompatParcelizer((AbstractPolymorphicSerializer) setgraphicmodalmaxwidthdp, this, strIconCompatParcelizer));
        } catch (SerializationException e) {
            String message = e.getMessage();
            message.getClass();
            throw coil3.util.IntPair.IconCompatParcelizer(r8lambdaerwhggzq_gqgn8cultnvrcshm8k.toString(), -1, message);
        }
    }

    public final void write(r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0 r8lambdagbekcaskecamm7h9dyqnzofon0, String str, String str2) {
        String str3;
        if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, "i", false)) {
            str3 = "an ";
        } else {
            str3 = "a ";
        }
        throw coil3.util.IntPair.IconCompatParcelizer(write().toString(), -1, "Failed to parse literal '" + r8lambdagbekcaskecamm7h9dyqnzofon0 + "' as " + str3.concat(str) + " value at element: " + read(str2));
    }

    @Override // o.createInAppMessageViewlambda1
    public final boolean write(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        return write(MediaBrowserCompatMediaItem(r8lambda92m0p9sit5uf70mvjf4rwmruda, i));
    }

    @Override // o.DefaultInAppMessageModalViewFactoryCompanion
    public final short ComponentActivity() {
        return MediaMetadataCompat(IconCompatParcelizer());
    }

    @Override // o.DefaultInAppMessageModalViewFactoryCompanion
    public final boolean MediaDescriptionCompat() {
        return write(IconCompatParcelizer());
    }

    @Override // o.DefaultInAppMessageModalViewFactoryCompanion
    public final char MediaSessionCompatResultReceiverWrapper() {
        return RemoteActionCompatParcelizer(IconCompatParcelizer());
    }

    @Override // o.DefaultInAppMessageModalViewFactoryCompanion
    public final int MediaSessionCompatToken() {
        return RatingCompat(IconCompatParcelizer());
    }

    @Override // o.DefaultInAppMessageModalViewFactoryCompanion
    public final double ParcelableVolumeInfo() {
        return read(IconCompatParcelizer());
    }

    @Override // o.DefaultInAppMessageModalViewFactoryCompanion
    public final float PlaybackStateCompat() {
        return serializer(IconCompatParcelizer());
    }

    @Override // o.DefaultInAppMessageModalViewFactoryCompanion
    public final byte PlaybackStateCompatCustomAction() {
        return IconCompatParcelizer(IconCompatParcelizer());
    }

    @Override // o.DefaultInAppMessageModalViewFactoryCompanion
    public final String ResultReceiver() {
        return MediaBrowserCompatMediaItem(IconCompatParcelizer());
    }

    @Override // o.DefaultInAppMessageModalViewFactoryCompanion
    public boolean r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        return !(write() instanceof r8lambdaOVm5S_u8QUSoMXvJUOeZHUBFeHc);
    }

    @Override // o.DefaultInAppMessageModalViewFactoryCompanion
    public final long r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
        return MediaSessionCompatQueueItem(IconCompatParcelizer());
    }

    public r8lambdaquOZlpDNY0TUGg1V6w2FHn0_r6Y(resetTransientState resettransientstate, String str) {
        this.write = resettransientstate;
        this.RemoteActionCompatParcelizer = str;
        this.serializer = resettransientstate.IconCompatParcelizer;
    }

    public final String read(String str) {
        str.getClass();
        return RatingCompat() + '.' + str;
    }

    public final String RatingCompat() {
        ArrayList arrayList = this.read;
        return arrayList.isEmpty() ? "$" : onContentCardDismissed.IconCompatParcelizer(arrayList, ".", "$.", null, null, 60);
    }
}
