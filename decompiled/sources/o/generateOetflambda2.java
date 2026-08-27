package o;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class generateOetflambda2 implements eotfFunclambda0 {
    public static final rotateRad0AR0LA0default write = new rotateRad0AR0LA0default(50);
    public final Class IconCompatParcelizer;
    public final eotfFunclambda0 MediaBrowserCompatMediaItem;
    public final getEotfFuncui_graphics MediaDescriptionCompat;
    public final getEotf MediaMetadataCompat;
    public final eotfFunclambda0 MediaSessionCompatQueueItem;
    public final int RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public final getF serializer;

    @Override // o.eotfFunclambda0
    public final int hashCode() {
        int iHashCode = this.MediaBrowserCompatMediaItem.hashCode();
        int iHashCode2 = this.MediaSessionCompatQueueItem.hashCode();
        int iHashCode3 = ((((iHashCode2 + (iHashCode * 31)) * 31) + this.RatingCompat) * 31) + this.RemoteActionCompatParcelizer;
        getEotf geteotf = this.MediaMetadataCompat;
        if (geteotf != null) {
            iHashCode3 = (iHashCode3 * 31) + geteotf.hashCode();
        }
        return this.MediaDescriptionCompat.write.hashCode() + ((this.IconCompatParcelizer.hashCode() + (iHashCode3 * 31)) * 31);
    }

    public generateOetflambda2(getF getf, eotfFunclambda0 eotffunclambda0, eotfFunclambda0 eotffunclambda1, int i, int i2, getEotf geteotf, Class cls, getEotfFuncui_graphics geteotffuncui_graphics) {
        this.serializer = getf;
        this.MediaBrowserCompatMediaItem = eotffunclambda0;
        this.MediaSessionCompatQueueItem = eotffunclambda1;
        this.RatingCompat = i;
        this.RemoteActionCompatParcelizer = i2;
        this.MediaMetadataCompat = geteotf;
        this.IconCompatParcelizer = cls;
        this.MediaDescriptionCompat = geteotffuncui_graphics;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.eotfFunclambda0
    public final void serializer(MessageDigest messageDigest) {
        Object obj;
        getF getf = this.serializer;
        synchronized (getf) {
            isHLGishui_graphics ishlgishui_graphics = getf.read;
            isPQishui_graphics ispqishui_graphicsRemoteActionCompatParcelizer = (isPQishui_graphics) ((ArrayDeque) ishlgishui_graphics.IconCompatParcelizer).poll();
            if (ispqishui_graphicsRemoteActionCompatParcelizer == null) {
                ispqishui_graphicsRemoteActionCompatParcelizer = ishlgishui_graphics.RemoteActionCompatParcelizer();
            }
            Rgbeotf1 rgbeotf1 = (Rgbeotf1) ispqishui_graphicsRemoteActionCompatParcelizer;
            rgbeotf1.serializer(byte[].class, 8);
            obj = getf.read(rgbeotf1, byte[].class);
        }
        byte[] bArr = (byte[]) obj;
        ByteBuffer.wrap(bArr).putInt(this.RatingCompat).putInt(this.RemoteActionCompatParcelizer).array();
        this.MediaSessionCompatQueueItem.serializer(messageDigest);
        this.MediaBrowserCompatMediaItem.serializer(messageDigest);
        messageDigest.update(bArr);
        getEotf geteotf = this.MediaMetadataCompat;
        if (geteotf != null) {
            geteotf.serializer(messageDigest);
        }
        this.MediaDescriptionCompat.serializer(messageDigest);
        rotateRad0AR0LA0default rotaterad0ar0la0default = write;
        Class cls = this.IconCompatParcelizer;
        byte[] bytes = (byte[]) rotaterad0ar0la0default.IconCompatParcelizer(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(eotfFunclambda0.read);
            rotaterad0ar0la0default.write(cls, bytes);
        }
        messageDigest.update(bytes);
        this.serializer.IconCompatParcelizer(bArr);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.MediaBrowserCompatMediaItem + ", signature=" + this.MediaSessionCompatQueueItem + ", width=" + this.RatingCompat + ", height=" + this.RemoteActionCompatParcelizer + ", decodedResourceClass=" + this.IconCompatParcelizer + ", transformation='" + this.MediaMetadataCompat + "', options=" + this.MediaDescriptionCompat + '}';
    }

    @Override // o.eotfFunclambda0
    public final boolean equals(Object obj) {
        if (!(obj instanceof generateOetflambda2)) {
            return false;
        }
        generateOetflambda2 generateoetflambda2 = (generateOetflambda2) obj;
        return this.RemoteActionCompatParcelizer == generateoetflambda2.RemoteActionCompatParcelizer && this.RatingCompat == generateoetflambda2.RatingCompat && Fill.IconCompatParcelizer(this.MediaMetadataCompat, generateoetflambda2.MediaMetadataCompat) && this.IconCompatParcelizer.equals(generateoetflambda2.IconCompatParcelizer) && this.MediaBrowserCompatMediaItem.equals(generateoetflambda2.MediaBrowserCompatMediaItem) && this.MediaSessionCompatQueueItem.equals(generateoetflambda2.MediaSessionCompatQueueItem) && this.MediaDescriptionCompat.equals(generateoetflambda2.MediaDescriptionCompat);
    }
}
