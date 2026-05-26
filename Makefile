.PHONY: setup run-dist

setup:
	cd code/app && ./gradlew clean install

run-dist:
	cd code/app && ./gradlew run