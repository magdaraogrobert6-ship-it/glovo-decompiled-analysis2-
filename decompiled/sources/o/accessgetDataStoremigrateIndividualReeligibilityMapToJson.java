package o;

import com.sentiance.sdk.usercontext.UserContextProvider;
import com.sentiance.sdk.usercontext.api.UserContextUpdateCriteria;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetDataStoremigrateIndividualReeligibilityMapToJson extends getLatitudeannotations<r8lambdaVyE3aElBJdrGw6tHJhFdi1NUMg> {
    final /* synthetic */ UserContextProvider read;

    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<r8lambdaVyE3aElBJdrGw6tHJhFdi1NUMg> getlongitudeannotations) {
        Object[] objArr = {UserContextUpdateCriteria.ACTIVE_SEGMENTS};
        int iSerializer = getQueryParameterslambda2.serializer();
        UserContextProvider.RemoteActionCompatParcelizer(this.read, (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessgetDataStoremigrateIndividualReeligibilityMapToJson(UserContextProvider userContextProvider, clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar) {
        super(clearandroid_sdk_base_releaseVar, "UserContextProvider");
        this.read = userContextProvider;
    }
}
