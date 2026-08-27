package o;

import java.util.List;
import kotlin.text.RegexKt;

/* JADX INFO: loaded from: classes4.dex */
public final class SwipeDismissTouchListener3 implements r8lambda92M0P9sIT5Uf70mvjF4RwMruDA {
    public static final SwipeDismissTouchListener3 read = new SwipeDismissTouchListener3();
    public static final String serializer = "kotlinx.serialization.json.JsonArray";
    public final /* synthetic */ InAppMessageJavascriptInterfaceCompanion write;

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final String serializer() {
        return serializer;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final int IconCompatParcelizer() {
        this.write.getClass();
        return 1;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final String IconCompatParcelizer(int i) {
        this.write.getClass();
        return String.valueOf(i);
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final boolean MediaBrowserCompatMediaItem() {
        this.write.getClass();
        return false;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final RegexKt RemoteActionCompatParcelizer() {
        this.write.getClass();
        return r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.RemoteActionCompatParcelizer;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA RemoteActionCompatParcelizer(int i) {
        return this.write.RemoteActionCompatParcelizer(i);
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final List read() {
        this.write.getClass();
        return instance_delegatelambda0.write;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final List serializer(int i) {
        this.write.serializer(i);
        return instance_delegatelambda0.write;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final boolean write() {
        this.write.getClass();
        return false;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final boolean write(int i) {
        this.write.write(i);
        return false;
    }

    public SwipeDismissTouchListener3() {
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor = r8lambda2svec8wazNIYAk5Hq146H0SPIb4.IconCompatParcelizer.getDescriptor();
        descriptor.getClass();
        this.write = new InAppMessageJavascriptInterfaceCompanion(descriptor, 0);
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final int read(String str) {
        str.getClass();
        return this.write.read(str);
    }
}
