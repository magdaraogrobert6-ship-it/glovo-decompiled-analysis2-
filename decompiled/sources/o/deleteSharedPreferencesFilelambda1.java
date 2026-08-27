package o;

import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class deleteSharedPreferencesFilelambda1 {
    public static final downloadFileToPathlambda0 Companion = new downloadFileToPathlambda0();
    public final deleteSharedPreferencesFilelambda0 a;
    public final deleteSharedPreferencesFilelambda0 b;
    public final deleteSharedPreferencesFilelambda0 c;
    public final deleteSharedPreferencesFilelambda0 d;
    public final deleteSharedPreferencesFilelambda0 e;
    public final deleteSharedPreferencesFilelambda0 f;
    public final deleteSharedPreferencesFilelambda0 g;

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        int iHashCode2 = this.b.hashCode();
        int iHashCode3 = this.c.hashCode();
        int iHashCode4 = this.d.hashCode();
        int iHashCode5 = this.e.hashCode();
        return this.g.hashCode() + ((this.f.hashCode() + ((iHashCode5 + ((iHashCode4 + ((iHashCode3 + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof deleteSharedPreferencesFilelambda1)) {
            return false;
        }
        deleteSharedPreferencesFilelambda1 deletesharedpreferencesfilelambda1 = (deleteSharedPreferencesFilelambda1) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.a, deletesharedpreferencesfilelambda1.a}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.b, deletesharedpreferencesfilelambda1.b}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.c, deletesharedpreferencesfilelambda1.c}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.d, deletesharedpreferencesfilelambda1.d}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.e, deletesharedpreferencesfilelambda1.e}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.f, deletesharedpreferencesfilelambda1.f}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.g, deletesharedpreferencesfilelambda1.g}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "SemanticTimeDefinition(morningStart=" + this.a + ", lateMorningStart=" + this.b + ", lunchStart=" + this.c + ", afternoonStart=" + this.d + ", earlyEveningStart=" + this.e + ", eveningStart=" + this.f + ", nightStart=" + this.g + ')';
    }

    public deleteSharedPreferencesFilelambda1(deleteSharedPreferencesFilelambda0 deletesharedpreferencesfilelambda0, deleteSharedPreferencesFilelambda0 deletesharedpreferencesfilelambda1, deleteSharedPreferencesFilelambda0 deletesharedpreferencesfilelambda2, deleteSharedPreferencesFilelambda0 deletesharedpreferencesfilelambda3, deleteSharedPreferencesFilelambda0 deletesharedpreferencesfilelambda4, deleteSharedPreferencesFilelambda0 deletesharedpreferencesfilelambda5, deleteSharedPreferencesFilelambda0 deletesharedpreferencesfilelambda6) {
        this.a = deletesharedpreferencesfilelambda0;
        this.b = deletesharedpreferencesfilelambda1;
        this.c = deletesharedpreferencesfilelambda2;
        this.d = deletesharedpreferencesfilelambda3;
        this.e = deletesharedpreferencesfilelambda4;
        this.f = deletesharedpreferencesfilelambda5;
        this.g = deletesharedpreferencesfilelambda6;
    }
}
