<script>
    import TopBar from "./components/TopBar/TopBar.svelte"
    import AppList from './components/AppList/AppList.svelte'
    import Button from './components/Button/Button.svelte'
    import Popup from './components/Popup/Popup.svelte'

    let showAddPopup = true;

</script>

<style src="./App.scss"></style>

<main class="container">

    <!-- Top bar -->
    <TopBar on:add={() => showAddPopup = true} />

    <!-- Content -->
    <div class="content">
        <AppList/>
    </div>

</main>
