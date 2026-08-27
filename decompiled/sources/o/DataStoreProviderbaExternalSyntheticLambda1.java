package o;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
final class DataStoreProviderbaExternalSyntheticLambda1 extends r8lambdaxlGZ37PBa_omfizFrRo1k0nbvE {
    final /* synthetic */ r8lambdasOoFVAVrS_IfmvnUsbXqKnKCa0 IconCompatParcelizer;
    final /* synthetic */ AtomicInteger RemoteActionCompatParcelizer;
    final /* synthetic */ int read;
    final /* synthetic */ AtomicBoolean write;

    @Override // o.r8lambdaxlGZ37PBa_omfizFrRo1k0nbvE
    public final void RemoteActionCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer.incrementAndGet() == this.read) {
            boolean z = this.write.get();
            r8lambdasOoFVAVrS_IfmvnUsbXqKnKCa0 r8lambdasoofvavrs_ifmvnusbxqknkca0 = this.IconCompatParcelizer;
            if (z) {
                r8lambdasoofvavrs_ifmvnusbxqknkca0.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(new r8lambdaAdNMoUKA2dYkpy5uQLS8giqo(r8lambdasoofvavrs_ifmvnusbxqknkca0, 1));
            } else {
                r8lambdasoofvavrs_ifmvnusbxqknkca0.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(new r8lambdaAdNMoUKA2dYkpy5uQLS8giqo(r8lambdasoofvavrs_ifmvnusbxqknkca0, 0));
            }
        }
    }

    public DataStoreProviderbaExternalSyntheticLambda1(AtomicInteger atomicInteger, int i, AtomicBoolean atomicBoolean, r8lambdasOoFVAVrS_IfmvnUsbXqKnKCa0 r8lambdasoofvavrs_ifmvnusbxqknkca0) {
        this.RemoteActionCompatParcelizer = atomicInteger;
        this.read = i;
        this.write = atomicBoolean;
        this.IconCompatParcelizer = r8lambdasoofvavrs_ifmvnusbxqknkca0;
    }

    @Override // o.r8lambdaxlGZ37PBa_omfizFrRo1k0nbvE
    public final void read() {
        this.write.set(false);
        if (this.RemoteActionCompatParcelizer.incrementAndGet() == this.read) {
            r8lambdasOoFVAVrS_IfmvnUsbXqKnKCa0 r8lambdasoofvavrs_ifmvnusbxqknkca0 = this.IconCompatParcelizer;
            r8lambdasoofvavrs_ifmvnusbxqknkca0.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(new r8lambdaAdNMoUKA2dYkpy5uQLS8giqo(r8lambdasoofvavrs_ifmvnusbxqknkca0, 0));
        }
    }
}
