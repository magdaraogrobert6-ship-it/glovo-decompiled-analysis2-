package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambda5t3L_1jnTLBJtf0fR47kG54a0bs {
    public static final mergeJsonObjectslambda00 RemoteActionCompatParcelizer = new mergeJsonObjectslambda00(String.valueOf(','));
    public static final r8lambda5t3L_1jnTLBJtf0fR47kG54a0bs write = new r8lambda5t3L_1jnTLBJtf0fR47kG54a0bs(r8lambdakcTilwmporjFCAWe8ASdQv1Ks.IconCompatParcelizer, false, new r8lambda5t3L_1jnTLBJtf0fR47kG54a0bs(new r8lambdakcTilwmporjFCAWe8ASdQv1Ks(0), true, new r8lambda5t3L_1jnTLBJtf0fR47kG54a0bs()));
    public final byte[] read;
    public final Map serializer;

    public r8lambda5t3L_1jnTLBJtf0fR47kG54a0bs(r8lambdakcTilwmporjFCAWe8ASdQv1Ks r8lambdakctilwmporjfcawe8asdqv1ks, boolean z, r8lambda5t3L_1jnTLBJtf0fR47kG54a0bs r8lambda5t3l_1jntlbjtf0fr47kg54a0bs) {
        String strIconCompatParcelizer = r8lambdakctilwmporjfcawe8asdqv1ks.IconCompatParcelizer();
        TextStreamsKt.read("Comma is currently not allowed in message encoding", !strIconCompatParcelizer.contains(","));
        int size = r8lambda5t3l_1jntlbjtf0fr47kg54a0bs.serializer.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(r8lambda5t3l_1jntlbjtf0fr47kg54a0bs.serializer.containsKey(r8lambdakctilwmporjfcawe8asdqv1ks.IconCompatParcelizer()) ? size : size + 1);
        for (PermissionUtils permissionUtils : r8lambda5t3l_1jntlbjtf0fr47kg54a0bs.serializer.values()) {
            String strIconCompatParcelizer2 = permissionUtils.write.IconCompatParcelizer();
            if (!strIconCompatParcelizer2.equals(strIconCompatParcelizer)) {
                linkedHashMap.put(strIconCompatParcelizer2, new PermissionUtils(permissionUtils.write, permissionUtils.serializer));
            }
        }
        linkedHashMap.put(strIconCompatParcelizer, new PermissionUtils(r8lambdakctilwmporjfcawe8asdqv1ks, z));
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        this.serializer = mapUnmodifiableMap;
        HashSet hashSet = new HashSet(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            if (((PermissionUtils) entry.getValue()).serializer) {
                hashSet.add((String) entry.getKey());
            }
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        mergeJsonObjectslambda00 mergejsonobjectslambda00 = RemoteActionCompatParcelizer;
        mergejsonobjectslambda00.getClass();
        Iterator it = setUnmodifiableSet.iterator();
        StringBuilder sb = new StringBuilder();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) mergejsonobjectslambda00.RemoteActionCompatParcelizer);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
            this.read = sb.toString().getBytes(Charset.forName("US-ASCII"));
        } catch (IOException e) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(e);
            throw null;
        }
    }

    public r8lambda5t3L_1jnTLBJtf0fR47kG54a0bs() {
        this.serializer = new LinkedHashMap(0);
        this.read = new byte[0];
    }
}
