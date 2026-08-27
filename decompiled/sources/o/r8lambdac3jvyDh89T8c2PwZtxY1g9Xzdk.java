package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.events.eventextras.TimelineUpdateDetails;
import com.sentiance.sdk.eventtimeline.timelines.creators.CallType;
import com.sentiance.sdk.util.database.WhereClause;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "CallTimelineCreator")
public class r8lambdac3jvyDh89T8c2PwZtxY1g9Xzdk implements r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    private r8lambda65DqD4z8gFhR5ZTM_6mU_Ajg8B4 IconCompatParcelizer = null;
    private final setHeaderTextColor RemoteActionCompatParcelizer;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI read;

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        this.IconCompatParcelizer = null;
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        return Collections.EMPTY_LIST;
    }

    public final List<getImageStyle> read() {
        r8lambda65DqD4z8gFhR5ZTM_6mU_Ajg8B4 r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4 = (r8lambda65DqD4z8gFhR5ZTM_6mU_Ajg8B4) this.RemoteActionCompatParcelizer.serializer(logImpressionlambda1.read());
        if (r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4 == null || r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4.serializer() != null || r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4.read() == null) {
            return Collections.EMPTY_LIST;
        }
        r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4.RemoteActionCompatParcelizer(r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4.read().longValue());
        return read(r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4);
    }

    public r8lambdac3jvyDh89T8c2PwZtxY1g9Xzdk(setHeaderTextColor setheadertextcolor, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni) {
        this.RemoteActionCompatParcelizer = setheadertextcolor;
        this.read = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
    }

    private ArrayList IconCompatParcelizer(CallType callType, long j) {
        ArrayList arrayList = new ArrayList();
        if (this.IconCompatParcelizer != null) {
            arrayList.addAll(write(j));
        }
        String string = UUID.randomUUID().toString();
        this.read.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        r8lambda65DqD4z8gFhR5ZTM_6mU_Ajg8B4 r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4 = new r8lambda65DqD4z8gFhR5ZTM_6mU_Ajg8B4(string, callType, j, j, Long.valueOf(j), null, jCurrentTimeMillis, jCurrentTimeMillis);
        this.IconCompatParcelizer = r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4;
        arrayList.add(getImageStyle.RemoteActionCompatParcelizer(r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4));
        return arrayList;
    }

    private List<getImageStyle> write(long j) {
        r8lambda65DqD4z8gFhR5ZTM_6mU_Ajg8B4 r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4 = this.IconCompatParcelizer;
        if (r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4 == null) {
            return Collections.EMPTY_LIST;
        }
        r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4.RemoteActionCompatParcelizer(j);
        List<getImageStyle> list = read(this.IconCompatParcelizer);
        this.IconCompatParcelizer = null;
        return list;
    }

    public final List<getImageStyle> write(getLongitudeannotations<r8lambda2L1vxSWbmFUTP9A4iejxpq7ZF7A> getlongitudeannotations) {
        CallType callType;
        r8lambda2L1vxSWbmFUTP9A4iejxpq7ZF7A r8lambda2l1vxswbmfutp9a4iejxpq7zf7a = getlongitudeannotations.read();
        if (r8lambda2l1vxswbmfutp9a4iejxpq7zf7a.serializer.byteValue() == 2) {
            callType = CallType.NO_CALL;
        } else {
            Byte b = r8lambda2l1vxswbmfutp9a4iejxpq7zf7a.read;
            if (b == null || b.byteValue() != 2) {
                callType = (b == null || b.byteValue() != 1) ? CallType.UNKNOWN : CallType.MOBILE_CALL;
            } else {
                callType = CallType.VOIP_CALL;
            }
        }
        long jWrite = getlongitudeannotations.write();
        r8lambda65DqD4z8gFhR5ZTM_6mU_Ajg8B4 r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4 = this.IconCompatParcelizer;
        if (r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4 == null || r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4.MediaBrowserCompatMediaItem() != callType) {
            return callType == CallType.NO_CALL ? write(jWrite) : IconCompatParcelizer(callType, jWrite);
        }
        return Collections.EMPTY_LIST;
    }

    public final List<getImageStyle> RemoteActionCompatParcelizer(long j) {
        return write(j);
    }

    public final List read(byte b, long j) {
        CallType callType;
        r8lambda65DqD4z8gFhR5ZTM_6mU_Ajg8B4 r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4 = this.IconCompatParcelizer;
        if (r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4 != null) {
            r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4.serializer(j);
            return read(this.IconCompatParcelizer);
        }
        if (b == 2) {
            callType = CallType.VOIP_CALL;
        } else if (b == 1) {
            callType = CallType.MOBILE_CALL;
        } else {
            callType = CallType.UNKNOWN;
        }
        return IconCompatParcelizer(callType, j);
    }

    private static List read(r8lambda65DqD4z8gFhR5ZTM_6mU_Ajg8B4 r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4) {
        return Collections.singletonList(new handleLogClicklambda0(logImpressionlambda1.read(), r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4.RemoteActionCompatParcelizer(), WhereClause.serializer("unique_id").write(r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4.r8lambda54BeH8ZsBru0CXI2CCSP2syNys()), true, new TimelineUpdateDetails()));
    }
}
