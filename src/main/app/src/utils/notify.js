import { Toast, TOAST_STATUS } from "bootstrap-toaster";

function notify(title, message, status, timeout) {
    let toast = {
        title: title,
        message: message,
        status: getStatus(status),
        timeout: (timeout ? timeout : 35000)
    }
    Toast.create(toast);
    addListener();
}

function getStatus(status) {
    switch (status) {
        case "success":
            return TOAST_STATUS.SUCCESS;
        case "info":
            return TOAST_STATUS.INFO;
        case "danger":
            return TOAST_STATUS.DANGER;
        case "warning":
            return TOAST_STATUS.WARNING;
        default:
            return TOAST_STATUS.INFO;
    }
}

function addListener() {
    //TODO As a feature see if number of messages in queue can be shown.
    // console.log(Toast.queue);
    // const toastInfo = Toast.queue;
    // toastInfo.forEach((element) => {
    //     element.toast.addEventListener('hidden.bs.toast', () => {
    //         console.log(Toast.queue);
    //     });
    // })
}

/*
const bsToast = new window["bootstrap"].Toast(toastInfo.toast);
bsToast.show();
this.currentToastCount++;
// When the toast hides, remove it from the DOM
toastInfo.toast.addEventListener('hidden.bs.toast', () => {
    TOAST_CONTAINER.removeChild(toastInfo.toast);
    this.currentToastCount--;
    if (this.queueEnabled && this.queue.length > 0 && this.currentToastCount < this.maxToastCount) {
        const queuedToast = this.queue.shift();
        this.render(queuedToast);
    }
});
*/

export default notify;