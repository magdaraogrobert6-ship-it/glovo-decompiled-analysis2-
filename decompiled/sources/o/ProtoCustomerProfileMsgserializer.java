package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.EOFException;
import java.lang.reflect.Method;
import java.util.Objects;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ProtoCustomerProfileMsgserializer extends LazyKt__LazyJVMKt {
    public final Method IconCompatParcelizer;
    public final getChangeVersionControl MediaDescriptionCompat;
    public final boolean read;
    public final int serializer;
    public final String write;

    public ProtoCustomerProfileMsgserializer(Method method, int i, String str, boolean z) {
        getChangeVersionControl getchangeversioncontrol = getChangeVersionControl.write;
        this.IconCompatParcelizer = method;
        this.serializer = i;
        Objects.requireNonNull(str, "name == null");
        this.write = str;
        this.MediaDescriptionCompat = getchangeversioncontrol;
        this.read = z;
    }

    @Override // kotlin.LazyKt__LazyJVMKt
    public final void read(ProtoFeatureMsg protoFeatureMsg, Object obj) throws EOFException {
        String strR8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        int i;
        String str = this.write;
        if (obj != null) {
            this.MediaDescriptionCompat.getClass();
            String string = obj.toString();
            if (protoFeatureMsg.MediaSessionCompatToken != null) {
                int length = string.length();
                int iCharCount = 0;
                while (true) {
                    if (iCharCount >= length) {
                        strR8lambda54BeH8ZsBru0CXI2CCSP2syNys = string;
                        break;
                    }
                    int iCodePointAt = string.codePointAt(iCharCount);
                    boolean z = this.read;
                    int i2 = 47;
                    int i3 = -1;
                    int i4 = 127;
                    int i5 = 32;
                    if (iCodePointAt >= 32 && iCodePointAt < 127 && " \"<>^`{}|\\?#".indexOf(iCodePointAt) == -1 && (z || (iCodePointAt != 47 && iCodePointAt != 37))) {
                        iCharCount += Character.charCount(iCodePointAt);
                    } else {
                        RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
                        registryMissingComponentException.IconCompatParcelizer(0, iCharCount, string);
                        RegistryMissingComponentException registryMissingComponentException2 = null;
                        while (iCharCount < length) {
                            int iCodePointAt2 = string.codePointAt(iCharCount);
                            if (z && (iCodePointAt2 == 9 || iCodePointAt2 == 10 || iCodePointAt2 == 12 || iCodePointAt2 == 13)) {
                                i = length;
                            } else if (iCodePointAt2 >= i5 && iCodePointAt2 < i4 && " \"<>^`{}|\\?#".indexOf(iCodePointAt2) == i3 && (z || (iCodePointAt2 != i2 && iCodePointAt2 != 37))) {
                                registryMissingComponentException.RatingCompat(iCodePointAt2);
                                i = length;
                            } else {
                                if (registryMissingComponentException2 == null) {
                                    registryMissingComponentException2 = new RegistryMissingComponentException();
                                }
                                registryMissingComponentException2.RatingCompat(iCodePointAt2);
                                long j = registryMissingComponentException2.size;
                                long j2 = 0;
                                while (j2 < j) {
                                    byte bIconCompatParcelizer = registryMissingComponentException2.IconCompatParcelizer(j2);
                                    registryMissingComponentException.read(37);
                                    char[] cArr = ProtoFeatureMsg.serializer;
                                    registryMissingComponentException.read((int) cArr[((bIconCompatParcelizer & 255) >> 4) & 15]);
                                    registryMissingComponentException.read((int) cArr[bIconCompatParcelizer & 15]);
                                    j2++;
                                    length = length;
                                }
                                i = length;
                                registryMissingComponentException2.serializer();
                            }
                            iCharCount += Character.charCount(iCodePointAt2);
                            length = i;
                            i2 = 47;
                            i3 = -1;
                            i4 = 127;
                            i5 = 32;
                        }
                        strR8lambda54BeH8ZsBru0CXI2CCSP2syNys = registryMissingComponentException.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                        break;
                    }
                }
                String strReplace = protoFeatureMsg.MediaSessionCompatToken.replace("{" + str + "}", strR8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                if (!ProtoFeatureMsg.RemoteActionCompatParcelizer.matcher(strReplace).matches()) {
                    protoFeatureMsg.MediaSessionCompatToken = strReplace;
                    return;
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(string));
                    return;
                }
            }
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, isAppSetIdReadingEnabled.serializer());
            return;
        }
        throw getKind.IconCompatParcelizer(this.IconCompatParcelizer, this.serializer, ff$$ExternalSyntheticOutline0.m("Path parameter \"", str, "\" value must not be null."), new Object[0]);
    }
}
