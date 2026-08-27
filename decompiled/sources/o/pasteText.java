package o;

import com.roadrunner.auth.data.AuthRepository;

/* JADX INFO: loaded from: classes3.dex */
public final class pasteText implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final convertStringJsonArrayToListlambda0 RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ pasteText(convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda0, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = convertstringjsonarraytolistlambda0;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = write + 79;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda0 = this.RemoteActionCompatParcelizer;
        if (i4 != 0) {
            if (i4 == 1) {
                return new pageDowndefault((AuthRepository) convertstringjsonarraytolistlambda0.write());
            }
            Object objWrite = convertstringjsonarraytolistlambda0.write();
            objWrite.getClass();
            return new rb((getError) objWrite);
        }
        performImeAction performimeaction = new performImeAction((onFillDatadefault) convertstringjsonarraytolistlambda0.write());
        int i5 = IconCompatParcelizer + 33;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return performimeaction;
        }
        throw null;
    }
}
