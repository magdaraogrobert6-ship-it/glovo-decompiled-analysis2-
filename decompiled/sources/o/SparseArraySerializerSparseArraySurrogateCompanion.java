package o;

import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda1;
import com.roadrunner.liveness.presentation.LivenessDetectionActivity;
import com.roadrunner.permission.api.model.PermissionModel;

/* JADX INFO: loaded from: classes3.dex */
public final class SparseArraySerializerSparseArraySurrogateCompanion {
    public final SQLite RemoteActionCompatParcelizer;
    public final r8lambdaBtq4C7Gm1QxfvCp_VmH0bvXHTU read;

    public SparseArraySerializerSparseArraySurrogateCompanion(SQLite sQLite, LivenessDetectionActivity livenessDetectionActivity, inRing inring) {
        inring.getClass();
        this.RemoteActionCompatParcelizer = sQLite;
        r8lambdaD96myUSzBh8SDkhp_7hY_RGQMM r8lambdad96myuszbh8sdkhp_7hy_rgqmm = (r8lambdaD96myUSzBh8SDkhp_7hY_RGQMM) inring;
        r8lambdaBtq4C7Gm1QxfvCp_VmH0bvXHTU r8lambdabtq4c7gm1qxfvcp_vmh0bvxhtuRemoteActionCompatParcelizer = r8lambdad96myuszbh8sdkhp_7hy_rgqmm.RemoteActionCompatParcelizer(new RetryWithDelay$$ExternalSyntheticLambda1(24, this), livenessDetectionActivity.getActivityResultRegistry(), new PermissionModel(r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08.CAMERA, true));
        this.read = r8lambdabtq4c7gm1qxfvcp_vmh0bvxhtuRemoteActionCompatParcelizer;
        livenessDetectionActivity.getLifecycle().IconCompatParcelizer(r8lambdabtq4c7gm1qxfvcp_vmh0bvxhtuRemoteActionCompatParcelizer);
    }
}
