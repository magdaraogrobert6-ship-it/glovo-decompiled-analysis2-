package o;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class TransacterTransaction extends updatePathOutline {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;

    @SerializedName("countries")
    private ArrayList<String> countries;

    @SerializedName("ema")
    private String emailServer;

    @SerializedName("exp")
    private Long expires;

    @SerializedName("sub")
    private Integer id;

    @SerializedName("iss")
    private String issuer;

    @SerializedName("nam")
    private String name;

    @SerializedName("password")
    private String password;

    @SerializedName("rol")
    private String role;

    @SerializedName("user_name")
    private String userName;

    public TransacterTransaction(int i, long j, String str, String str2, String str3, String str4, String str5, ArrayList<String> arrayList) {
        this.id = Integer.valueOf(i);
        this.expires = Long.valueOf(j);
        this.userName = str;
        this.emailServer = str2;
        this.issuer = str3;
        this.name = str4;
        this.role = str5;
        this.countries = arrayList;
    }

    public TransacterTransaction(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.userName = str;
        this.password = str2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:19:0x003a  */
    /* JADX WARN: Code duplicated, block: B:20:0x0041  */
    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX INFO: renamed from: transform, reason: collision with other method in class */
    public afterRollback m5149transform() throws com.data.util.exception.FoodoraMigrationException {
        Integer num;
        long jLongValue;
        long jIntValue;
        Long l;
        int i;
        int i2 = 2 % 2;
        if (this.emailServer != null) {
            int i3 = write;
            int i4 = i3 + 1;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 17 / 0;
                if (this.issuer != null) {
                    if (this.name != null) {
                        int i6 = i3 + 27;
                        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                        if (this.role != null && this.countries != null) {
                            num = this.id;
                            jLongValue = 0;
                            if (num != null) {
                                jIntValue = num.intValue();
                            } else {
                                jIntValue = 0;
                            }
                            l = this.expires;
                            if (l != null) {
                                i = IconCompatParcelizer + 11;
                                write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i % 2 == 0) {
                                    jLongValue = l.longValue();
                                    int i8 = 3 / 0;
                                } else {
                                    jLongValue = l.longValue();
                                }
                            }
                            return new afterRollback(jIntValue, jLongValue, null, null, this.emailServer, this.issuer, this.name, null, this.role, null, null, null, this.countries, null, 11916, null);
                        }
                    }
                }
            } else if (this.issuer != null) {
                if (this.name != null) {
                    int i9 = i3 + 27;
                    IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    if (this.role != null) {
                        num = this.id;
                        jLongValue = 0;
                        if (num != null) {
                            jIntValue = num.intValue();
                        } else {
                            jIntValue = 0;
                        }
                        l = this.expires;
                        if (l != null) {
                            i = IconCompatParcelizer + 11;
                            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i % 2 == 0) {
                                jLongValue = l.longValue();
                                int i11 = 3 / 0;
                            } else {
                                jLongValue = l.longValue();
                            }
                        }
                        return new afterRollback(jIntValue, jLongValue, null, null, this.emailServer, this.issuer, this.name, null, this.role, null, null, null, this.countries, null, 11916, null);
                    }
                }
            }
        }
        throw new com.data.util.exception.FoodoraMigrationException(TransacterTransaction.class, this);
    }

    public /* synthetic */ Object transform() throws com.data.util.exception.FoodoraMigrationException {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 51;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        afterRollback afterrollbackM5149transform = m5149transform();
        int i4 = write + 57;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return afterrollbackM5149transform;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
