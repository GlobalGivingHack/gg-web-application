var module = angular.module('scorekeep');
module.controller('DonorEventsController', DonorEvents);
function DonorEvents($scope, DonorEventService) {
    $scope.donorEvents = DonorEventService.query();
}
