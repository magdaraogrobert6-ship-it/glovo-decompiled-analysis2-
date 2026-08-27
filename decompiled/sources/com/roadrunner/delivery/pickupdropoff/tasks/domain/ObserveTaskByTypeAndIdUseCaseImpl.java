package com.roadrunner.delivery.pickupdropoff.tasks.domain;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.pickupdropoff.tasks.data.TasksRepository;
import com.roadrunner.delivery.pickupdropoff.tasks.data.TasksRepository$observeLocalTasks$$inlined$map$1;
import com.roadrunner.delivery.pickupdropoff.tasks.data.TasksRepository$observeLocalTasks$1;
import com.roadrunner.home.nest.config.GetNestScope$invoke$$inlined$map$1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class ObserveTaskByTypeAndIdUseCaseImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final TasksRepository IconCompatParcelizer;

    public ObserveTaskByTypeAndIdUseCaseImpl(TasksRepository tasksRepository) {
        tasksRepository.getClass();
        this.IconCompatParcelizer = tasksRepository;
    }

    public final Flow serializer(long j, String str, String str2, r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk) {
        int i = 2 % 2;
        str.getClass();
        str2.getClass();
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("ObserveTaskByTypeAndIdUseCaseImpl: invoke called", new Object[0]);
        TasksRepository tasksRepository = this.IconCompatParcelizer;
        tasksRepository.getClass();
        Flow flowSerializer = FlowKt.serializer(new GetNestScope$invoke$$inlined$map$1(FlowKt.serializer(new TasksRepository$observeLocalTasks$$inlined$map$1(new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new TasksRepository$observeLocalTasks$1(tasksRepository, j, str, null, 0), tasksRepository.RemoteActionCompatParcelizer), TasksRepository.read(j, str), 0)), r8lambdaucgighn8fiyv_vccodeafjfpedk, str2, 6));
        int i2 = RemoteActionCompatParcelizer + 11;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return flowSerializer;
    }
}
