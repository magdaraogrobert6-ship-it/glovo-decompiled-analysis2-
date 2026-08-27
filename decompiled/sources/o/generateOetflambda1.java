package o;

import androidx.transition.Transition$1;

/* JADX INFO: loaded from: classes.dex */
public final class generateOetflambda1 implements generateOetf, accessgetDefaultJoincp {
    public static final androidx.emoji2.text.EmojiProcessor serializer = getCapKaPHkGw.write(20, new Transition$1(13));
    public boolean IconCompatParcelizer;
    public boolean RemoteActionCompatParcelizer;
    public generateOetf read;
    public final ChildLayerDependenciesTracker write = new ChildLayerDependenciesTracker();

    @Override // o.generateOetf
    public final void MediaBrowserCompatMediaItem() {
        synchronized (this) {
            this.write.serializer();
            this.IconCompatParcelizer = true;
            if (!this.RemoteActionCompatParcelizer) {
                this.read.MediaBrowserCompatMediaItem();
                this.read = null;
                serializer.IconCompatParcelizer(this);
            }
        }
    }

    @Override // o.accessgetDefaultJoincp
    public final ChildLayerDependenciesTracker n_() {
        return this.write;
    }

    public final void serializer() {
        synchronized (this) {
            this.write.serializer();
            if (!this.RemoteActionCompatParcelizer) {
                throw new IllegalStateException("Already unlocked");
            }
            this.RemoteActionCompatParcelizer = false;
            if (this.IconCompatParcelizer) {
                MediaBrowserCompatMediaItem();
            }
        }
    }

    @Override // o.generateOetf
    public final Object IconCompatParcelizer() {
        return this.read.IconCompatParcelizer();
    }

    @Override // o.generateOetf
    public final Class RemoteActionCompatParcelizer() {
        return this.read.RemoteActionCompatParcelizer();
    }

    @Override // o.generateOetf
    public final int write() {
        return this.read.write();
    }
}
