.PHONY: setup run-dist

setup:
	cd app && ./gradlew clean install

run-dist:
	cd app && ./gradlew run