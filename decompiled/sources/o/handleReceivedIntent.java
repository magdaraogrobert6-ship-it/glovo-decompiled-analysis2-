package o;

import android.telephony.PhoneStateListener;

/* JADX INFO: loaded from: classes5.dex */
final class handleReceivedIntent extends PhoneStateListener {
    final /* synthetic */ r8lambda4tw6qGEZKA92pQHVpugcqueiFhg serializer;

    public handleReceivedIntent(r8lambda4tw6qGEZKA92pQHVpugcqueiFhg r8lambda4tw6qgezka92pqhvpugcqueifhg) {
        this.serializer = r8lambda4tw6qgezka92pqhvpugcqueifhg;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i, String str) {
        ((handleAdmRegistrationIntent) ((BrazePushReceiverCompanion) this.serializer).write.IconCompatParcelizer).serializer(i);
    }
}
