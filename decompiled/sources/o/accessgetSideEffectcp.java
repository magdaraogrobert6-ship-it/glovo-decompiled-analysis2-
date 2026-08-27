package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetSideEffectcp {
    public static final isAltPressedZmokQxo IconCompatParcelizer;
    public static final isAltPressedZmokQxo RemoteActionCompatParcelizer;
    public static final isAltPressedZmokQxo serializer;

    static {
        truncslo4al4 truncslo4al4Var = new truncslo4al4(getTypeZmokQxo.serializer(), true, true);
        truncslo4al4Var.serializer("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        IconCompatParcelizer = truncslo4al4Var.serializer("measurement.audience.refresh_event_count_filters_timestamp", false);
        RemoteActionCompatParcelizer = truncslo4al4Var.serializer("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        serializer = truncslo4al4Var.serializer("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }
}
